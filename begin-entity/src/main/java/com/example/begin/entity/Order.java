package com.example.begin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:22
 * @version 1.0
 */
@Data
public class Order {
    private Long id;
    private Integer uid;
    private Integer aid;
    private Integer totalmoney;
    private Integer paymoney;
    private Integer freemoney;
    private Integer flag;
    private Integer paytype;
    private Date ctime;
    private Date utime;
}
