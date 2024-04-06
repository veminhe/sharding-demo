package com.hmblogs.controller;

import com.hmblogs.entity.OrderEntity;
import com.hmblogs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/save")
    public String save(@RequestParam("userId") Integer userId) {
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(userId.longValue());
        entity.setUserId(userId);
        orderService.save(entity);
        return "ok";
    }

    @GetMapping("/findAll")
    public List<OrderEntity> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/findById")
    public OrderEntity findById(@RequestParam("id") Long id) {
        return orderService.findById(id);
    }
}

