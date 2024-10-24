package com.henrae1001.springbootmall.dao;
import com.henrae1001.springbootmall.dto.OrderQueryParams;
import com.henrae1001.springbootmall.model.Order;
import com.henrae1001.springbootmall.model.OrderItem;
import java.util.List;

public interface OrderDao {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId,Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
