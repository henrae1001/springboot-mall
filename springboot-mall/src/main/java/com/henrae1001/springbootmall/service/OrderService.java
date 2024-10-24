package com.henrae1001.springbootmall.service;

import com.henrae1001.springbootmall.dto.CreateOrderRequest;
import com.henrae1001.springbootmall.dto.OrderQueryParams;
import com.henrae1001.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
