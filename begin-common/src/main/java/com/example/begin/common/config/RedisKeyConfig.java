package com.example.begin.common.config;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 15:02
 * @version 1.0
 */
public class RedisKeyConfig {

    //记录点赞的内容  ZSet
    public static String LIKE_CID="like:";//cit
    //点赞热点数据 有效期3个月
    public static int LIKE_TIME=90;


    //购物车相关
    public static String CART_UID="cart:user:";//uid
    //购物车数据 有效期24小时
    public static int CART_TIME=24;

    //下单接口 分布式锁
    public static String ORDER_LOCK="order:create:";//skuid

    //存储订单信息 String类型  -有效期2小时
    public static String ORDER_V2="order:v2:";//订单id  值：订单对象
    //存储订单详情-Hash类型 key field:skuid  value:订单详情对象
    public static String ORDERITEM_V2="order:item:v2:";//订单id
    //订单数据 有效期2小时
    public static int ORDER_TIME=2;
}
