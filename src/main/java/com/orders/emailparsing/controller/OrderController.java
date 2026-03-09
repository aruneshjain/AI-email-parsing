package com.orders.emailparsing.controller;

import com.orders.emailparsing.entity.Orders;
import com.orders.emailparsing.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Orders> findAll() {
        return orderService.getAllOrders();
    }
}
