package com.orders.emailparsing.service;

import com.orders.emailparsing.entity.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getAllOrders();
}
