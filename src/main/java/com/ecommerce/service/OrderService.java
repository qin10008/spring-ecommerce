package com.ecommerce.service;

import com.ecommerce.model.Order;
import java.util.List;

public interface OrderService {
    Order getOrderById(Integer id);
    List<Order> getOrdersByUserId(Integer userId);
    List<Order> getAllOrders();
    void addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(Integer id);
}
