package com.huawei.module1.service;

import java.io.IOException;

import com.huawei.module1.model.gsontest;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.google.gson.Gson;


public class test1 {


    public static void main(String[] args) throws HttpException, IOException {

        String socketCode=new String();
        //for (int i=0;i<10;i++){
            String url = "http://hq.sinajs.cn/list=sz300001";
            String str=sendGet(url);
            int a=str.indexOf("=");
        String b=str.substring(a+2);
            Gson gson = new Gson();
            gsontest fromJson = gson.fromJson(b, gsontest.class);
        System.out.println(fromJson);
        //}
    }


    public static String sendGet(String urlParam) throws HttpException, IOException {
        // 创建httpClient实例对象
        HttpClient httpClient = new HttpClient();
        // 设置httpClient连接主机服务器超时时间：15000毫秒
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(15000);
        // 创建GET请求方法实例对象
        GetMethod getMethod = new GetMethod(urlParam);
        // 设置post请求超时时间
        getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 60000);
        getMethod.addRequestHeader("Content-Type", "application/json");

        httpClient.executeMethod(getMethod);

        String result = getMethod.getResponseBodyAsString();
        getMethod.releaseConnection();
        return result;
    }
}
