package com.example.begin.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:24
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.example.begin.order.dao")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
