package com.orders.emailparsing.service.serviceImpl;

import com.orders.emailparsing.entity.Orders;
import com.orders.emailparsing.repository.OrderRepository;
import com.orders.emailparsing.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

     @Override
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }
}
