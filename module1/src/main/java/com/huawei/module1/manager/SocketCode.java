package com.huawei.module1.manager;

import com.huawei.module1.common.CommonResp;
import com.huawei.module1.mapper.MarketInfoMapper;
import com.huawei.module1.model.MarketInfo;
import com.huawei.module1.model.Socket;
import com.huawei.module1.util.HttpRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Component
public class SocketCode {

    private static String sinaTargetUrl= "http://hq.sinajs.cn/list={socketId}";

    @Autowired
    private MarketInfoMapper marketInfoMapper;

    /**
     *
     * @param scnumber 市场编号 0-4
     * @param market 所属市场 sz sh
     * @return 股票基础信息
     * @throws IOException IOException
     */
    public List<Socket> getSocketInfo(int scnumber, String market) {

        List<MarketInfo> marketInfos=marketInfoMapper.queryMarketInfo(MarketInfo.builder().scnumber(scnumber).market(market).build());
        if(marketInfos.size() != 1){
            //TODO 加入通用错误返回
            return null;
        }
        int start=Integer.parseInt(marketInfos.get(0).getRangestart());
        int end=Integer.parseInt(marketInfos.get(0).getRangeend());
        List<Socket> socket = new ArrayList();

        for(int i=start;i<end+1;i++){
            String code=getSocketNum(i);
            String url=sinaTargetUrl.replace("{socketId}",market+code);
            Socket socketModel=getSingleSocket(url);
            if(socketModel!=null){
                socketModel.setCodeId(code);
                socketModel.setTerritory(market);
                socket.add(socketModel);
            }
        }

        return socket;

    }

    /**
     * TODO 添加Exception 处理失去连接问题
     * 获取所有股票代码和股票名称
     */
    private Socket getSingleSocket(String targetUrl)  {
        String str=null;
        try{
            str= HttpRequest.sendGet(targetUrl);
        }catch (Exception e){
            System.out.println(e);
        }
        if(str ==null){
            System.out.println(targetUrl+"失败");
            return null;
        }
        String result[]=null;
        result= StringUtils.split(str,"\"");

        String socketName[]=StringUtils.split(result[1],",");
        if(socketName.length < 2){
            return null;
        }else {
            return Socket.builder().codeName(socketName[0]).build();
        }
    }

    /**
     * 拼接市场的股票代码
     */
    private String getSocketNum(int a){

        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(6);
        //设置最小整数位数
        nf.setMinimumIntegerDigits(6);
        //输出测试语句
        return nf.format(a);
    }
}
