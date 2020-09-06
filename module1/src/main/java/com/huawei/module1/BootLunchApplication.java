package com.huawei.module1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.huawei.module1.mapper"})
public class BootLunchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootLunchApplication.class);
    }
}
