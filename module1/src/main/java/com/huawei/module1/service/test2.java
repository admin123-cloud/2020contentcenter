package com.huawei.module1.service;

import java.text.NumberFormat;
import java.text.ParseException;

public class test2 {
    public static void main(String[] args) throws ParseException {


        int i = 1;
        //得到一个NumberFormat的实例
        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(6);
        //设置最小整数位数
        nf.setMinimumIntegerDigits(6);
        //输出测试语句
        System.out.println(nf.format(i));
    }
}
