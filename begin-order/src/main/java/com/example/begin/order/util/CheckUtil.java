package com.example.begin.order.util;

import com.example.begin.common.dto.OrderAddDto;

/**
 * @project CloudLike
 * @description 校验OrderAddDto是否合法
 * @author 徐天麒
 * @createTime 2020/11/5 19:25
 * @version 1.0
 */
public class CheckUtil {

    public static boolean checkOrderDto(OrderAddDto orderAddDto) {
        if (orderAddDto.getAid() > 0 && orderAddDto.getUid() > 0 && orderAddDto.getList() != null && orderAddDto.getPaytype() > 0 && orderAddDto.getType() > 0) {
            return true;
        }
        return false;
    }
}
