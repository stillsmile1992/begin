package com.example.begin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:23
 * @version 1.0
 */
@Data
public class OrderItem {
    private Integer id;
    private Long oid;
    private Integer skuid;
    private Integer count;
    private Integer price;
    private Date ctime;

}
