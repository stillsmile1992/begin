package com.example.begin.common.dto;

import lombok.Data;

import java.util.List;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:44
 * @version 1.0
 */
@Data
public class OrderAddDto {

    /**
     * 标记位1立即购买 2购物车
     */
    private Integer type;
    private Integer uid;
    private Integer aid;
    private List<OrderItemDto> list;
    private Integer paytype;
    /**
     * skuid-skuid
     */
    private String skuids;
}
