package com.huawei.module1.service;

import com.huawei.module1.manager.SocketCode;
import com.huawei.module1.model.Socket;

import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        SocketCode socketCode =new SocketCode();
        //List<Socket> socketList =socketCode.getSocketInfo(2,"sz");
        //System.out.println(socketList);
        String[] ind = {"股票名称","今日开盘价","昨日收盘价","当前价格","今日最高价","今日最低价","买一报价","卖一报价","成交股数",
                "成交金额","买一股数","买一报价","买二股数","买二报价","买三股数","买三报价","买四股数","买四报价","买五股数","买五报价",
                "卖一股数","卖一报价","卖二股数","卖二报价","卖三股数","卖三报价","卖四股数","卖四报价","卖五股数","卖五报价","当前日期","当前时间"};

        String a="var hq_str_sz300001=\"特锐德,20.250,20.980,20.400,20.600,20.120,20.400,20.410,16130056,328633735.210,50900,20.400,13900,20.390,62400,20.380,32600,20.370,7000,20.360,3200,20.410,8200,20.420,8700,20.430,86600,20.440,5600,20.450,2020-09-04,16:30:00,00,D|100|2040.000\";";
        String[] fcs = a.split("\"");          //按"号分割字符
        String scs = fcs[1];
        String[] tcs = scs.split(",");

        /*for(int i=0;i<tcs.length-1;i++){
            System.out.println(ind[i] + "： " +tcs[i]);
        }*/

    }
}
