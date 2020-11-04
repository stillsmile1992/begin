package com.example.begin.cart.service.intf;

import com.example.begin.common.dto.CartAddDto;
import com.example.begin.common.dto.CartItemDto;
import com.example.begin.common.vo.Result;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/4 16:50
 * @version 1.0
 */
public interface CartService {

    /**
     * 加入购物车
     * @param dto
     * @return
     */
    Result addCartV1(CartAddDto dto);

    /**
     * 数量增加
     * @param dto
     * @return
     */
    Result plusCartV1(CartItemDto dto);

    /**
     * 数量减少
     * @param dto
     * @return
     */
    Result minusCartV1(CartItemDto dto);

    /**
     * 删除
     * @param id
     * @return
     */
    Result delCart(int id);

    /**
     * 查询全部
     * @param uid
     * @return
     */
    Result all(int uid);
}
