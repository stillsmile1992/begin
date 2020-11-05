package com.example.begin.order.service.impl;

import com.example.begin.common.config.RedisKeyConfig;
import com.example.begin.common.dto.OrderAddDto;
import com.example.begin.common.dto.OrderItemDto;
import com.example.begin.common.third.RedissonUtil;
import com.example.begin.common.util.IdGeneratorSingleton;
import com.example.begin.common.vo.Result;
import com.example.begin.entity.Order;
import com.example.begin.entity.OrderItem;
import com.example.begin.order.config.OrderType;
import com.example.begin.order.dao.OrderDao;
import com.example.begin.order.dao.OrderItemDao;
import com.example.begin.order.service.intf.OrderService;
import com.example.begin.order.util.CheckUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @project begin
 * @description
 * @author 徐天麒
 * @createTime 2020/11/5 11:01
 * @version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderItemDao orderItemDao;

    @Override
    @Transactional
    public Result addOrderV1(OrderAddDto dto) {

        //校验参数非空
        if (dto != null) {
            //校验参数合法
            if (CheckUtil.checkOrderDto(dto)) {

                //模拟数据
                Random random = new Random();
                //总价格
                int t = 0;
                //订单详情集合
                ArrayList<Object> list = new ArrayList<>();
                //创建订单
                Order order = new Order();
                order.setId(IdGeneratorSingleton.getInstance().generator.nextId());
                //分布式锁 锁定库存 避免超卖
                try {
                    RedissonUtil.lock(RedisKeyConfig.ORDER_LOCK + dto.getSkuids(), 3);
                    //计算
                    for (OrderItemDto itemDto : dto.getList()) {
                        OrderItem orderItem = new OrderItem();
                        orderItem.setOid(order.getId());
                        orderItem.setSkuid(itemDto.getSkuid());
                        //查询数据库，获取最新价格和库存
                        orderItem.setPrice(random.nextInt(100) + 1);
                        //判断库存
                        if (itemDto.getCount() > random.nextInt(100) + 1) {
                            return Result.fail("库存不足");
                        } else {
                            orderItem.setCount(itemDto.getCount());
                        }
                        t += orderItem.getCount() * orderItem.getPrice();
                        list.add(orderItem);
                    }
                    order.setTotalmoney(t);
                    order.setPaytype(dto.getPaytype());

                    //优惠金额
                    int fm = 0;
                    //调用优惠券
                    //调用满减
                    //调用积分
                    //调用红包
                    //调用会员折扣
                    fm = random.nextInt(100);
                    order.setFreemoney(fm);
                    order.setPaymoney(t - fm);
                    order.setFlag(OrderType.待支付.getVal());

                    //增加订单
                    orderDao.insert(order);
                    //增加订单详情
                    orderItemDao.insertBatch(list);
                    //调用库存服务更改库存
                    //生成系统消息
                } finally {
                    RedissonUtil.unlock(RedisKeyConfig.ORDER_LOCK + dto.getSkuids());
                }
                return Result.ok();
            }
            return Result.fail("参数错误");
        }
        return Result.fail("数据为空");
    }

    @Override
    public Result addOrderV2(OrderAddDto dto) {
        return null;
    }

    @Override
    public Result queryOrderById(int id) {
        return null;
    }

    @Override
    public Result queryAll(int uid) {
        List<Order> list = orderDao.selectByUid(uid);
        return Result.ok(list);
    }

}
