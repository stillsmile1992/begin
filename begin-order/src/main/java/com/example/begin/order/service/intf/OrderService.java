package com.example.begin.order.service.intf;

import com.example.begin.common.dto.OrderAddDto;
import com.example.begin.common.vo.Result;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:42
 * @version 1.0
 */
public interface OrderService {

    /**
     * 创建订单
     * @param dto
     * @return
     */
    Result addOrderV1(OrderAddDto dto);

    /**
     * 创建订单 第二版加入消息队列
     * @param dto
     * @return
     */
    Result addOrderV2(OrderAddDto dto);

    /**
     * 按id查询订单
     * @param id
     * @return
     */
    Result queryOrderById(int id);

    /**
     * 按uid查询
     * @param uid
     * @return
     */
    Result queryAll(int uid);

}
