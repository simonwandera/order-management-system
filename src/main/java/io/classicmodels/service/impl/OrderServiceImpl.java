package io.classicmodels.service.impl;

import io.classicmodels.DAO.OrderDAO;
import io.classicmodels.entity.Order;
import io.classicmodels.service.OrderService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class OrderServiceImpl implements OrderService {

    @Inject
    private OrderDAO orderDAO;
    @Override
    public List<Order> getAllOrders() {
        return orderDAO.listAll();
    }

    @Override
    public Order getOrder(Integer orderNumber) {
        return orderDAO.read(orderNumber);
    }

    @Override
    public Order createOrder(Order order) {
       return orderDAO.insert(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderDAO.insert(order);
    }

    @Override
    public boolean deleteOrder(Integer orderNumber) {
        return orderDAO.deleteById(orderNumber);
    }
}
