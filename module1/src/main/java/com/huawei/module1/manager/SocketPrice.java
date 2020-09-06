package com.huawei.module1.manager;

import org.springframework.stereotype.Component;

@Component
public class SocketPrice {

    //获取过去20天每日股票价格的接口
    private static String sinaTargetUrl="http://money.finance.sina.com.cn/quotes_service/api/json_v2.php/CN_MarketData.getKLineData?symbol={socketId}&scale=60&ma=no&datalen=1023";

    public void queryPrice(){

    }

}
