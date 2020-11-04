package com.example.begin.common.dto;

import lombok.Data;

/**
 * @project cloudlike
 * @description
 * @author 徐天麒
 * @createTime 2020/11/4 15:34
 * @version 1.0
 */
@Data
public class CartAddDto {
    private int skuid;
    private int uid;
    private int jprice;
    private int count;
}
