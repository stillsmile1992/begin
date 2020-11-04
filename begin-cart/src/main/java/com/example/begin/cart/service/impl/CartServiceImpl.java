package com.example.begin.cart.service.impl;

import com.example.begin.cart.dao.CartDao;
import com.example.begin.cart.service.intf.CartService;
import com.example.begin.common.dto.CartAddDto;
import com.example.begin.common.dto.CartItemDto;
import com.example.begin.common.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/4 16:58
 * @version 1.0
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Result addCartV1(CartAddDto dto) {
        return null;
    }

    @Override
    public Result plusCartV1(CartItemDto dto) {
        return null;
    }

    @Override
    public Result minusCartV1(CartItemDto dto) {
        return null;
    }

    @Override
    public Result delCart(int id) {
        return null;
    }

    @Override
    public Result all(int uid) {
        return null;
    }
}
