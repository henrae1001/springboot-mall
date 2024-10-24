package com.henrae1001.springbootmall.service;

import com.henrae1001.springbootmall.dto.CreateOrderRequest;
import com.henrae1001.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
