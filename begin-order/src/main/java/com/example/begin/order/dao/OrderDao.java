package com.example.begin.order.dao;

import com.example.begin.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 11:04
 * @version 1.0
 */
@Repository
public interface OrderDao {

    @Insert("insert into t_order(id,aid,uid,totalmoney,freemoney,paymoney,paytype,ctime,utime,flag) values(#{id},#{aid},#{uid},#{totalmoney},#{freemoney},#{paymoney},#{paytype},now(),now(),#{flag})")
    int insert(Order order);

    @Select("select * from t_order where id = #{id} and flag = 1")
    Order selectById(long id);

    @Select("select * from t_order where uid = #{uid}")
    List<Order> selectByUid(int uid);
}
