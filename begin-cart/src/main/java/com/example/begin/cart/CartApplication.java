package com.example.begin.cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/4 16:24
 * @version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.begin.cart.dao")
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class,args);
    }
}
