package io.classicmodels.service;

import io.classicmodels.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrder(Integer orderNumber);

    Order createOrder(Order order);

    Order updateOrder(Order order);

    boolean deleteOrder(Integer orderNumber);
}
