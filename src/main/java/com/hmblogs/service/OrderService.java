package com.hmblogs.service;

import com.hmblogs.dao.OrderRepository;
import com.hmblogs.entity.OrderEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    public void save(OrderEntity entity) {
        orderRepository.save(entity);
    }

    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    public OrderEntity findById(Long id) {
        return orderRepository.findById(id).get();
    }
}
