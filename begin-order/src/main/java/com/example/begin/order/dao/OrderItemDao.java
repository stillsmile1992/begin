package com.example.begin.order.dao;

import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 11:04
 * @version 1.0
 */
@Repository
public interface OrderItemDao {

    /**
     * 批量插入
     * @param list
     * @return
     */
    int[] insertBatch(Collection<Object> list);
}
