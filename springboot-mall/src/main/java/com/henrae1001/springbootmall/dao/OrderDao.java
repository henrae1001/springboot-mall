package com.henrae1001.springbootmall.dao;
import com.henrae1001.springbootmall.model.OrderItem;
import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId,Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
