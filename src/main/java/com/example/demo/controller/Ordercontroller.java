package com.example.demo.controller;


import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ordercontroller {
    @Autowired
    OrderMapper orderMapper;
    @RequestMapping("/order/select")
    public List<Order> select() {
//        String str = String.valueOf(UUID.randomUUID());//随机生成唯一的订单号
//        order.setNum(str);
//        orderMapper.update(order.getId(), order.getNum());
        return orderMapper.select();
    }
    @RequestMapping("/order/delete")
    public void delete(int id) {
        orderMapper.delete(id);
    }
    @RequestMapping("/order/search")
    public List<Order> search(String name) {
        return orderMapper.search(name);
    }
}
