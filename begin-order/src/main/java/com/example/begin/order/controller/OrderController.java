package com.example.begin.order.controller;

import com.example.begin.common.dto.OrderAddDto;
import com.example.begin.common.vo.Result;
import com.example.begin.order.service.intf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 10:38
 * @version 1.0
 */
@RestController
@RequestMapping("/provider/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Result addOrder(OrderAddDto orderAddDto){
        return orderService.addOrderV1(orderAddDto);
    }

    @GetMapping("/querybyid")
    public Result queryById(long id){
        return orderService.queryOrderById(id);
    }

    @GetMapping("/queryall")
    public Result queryByUid(int uid){
        return orderService.queryAll(uid);
    }
}
