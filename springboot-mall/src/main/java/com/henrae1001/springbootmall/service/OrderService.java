package com.henrae1001.springbootmall.service;

import com.henrae1001.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
