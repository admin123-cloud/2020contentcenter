package com.huawei.module1.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControlTest {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello---------- "+name;
    }
}
