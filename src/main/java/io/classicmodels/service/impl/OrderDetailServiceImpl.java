package io.classicmodels.service.impl;

import io.classicmodels.DAO.OrderDAO;
import io.classicmodels.DAO.OrderDetailDAO;
import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;
import io.classicmodels.entity.Product;
import io.classicmodels.service.OrderDetailService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class OrderDetailServiceImpl implements OrderDetailService {

    @Inject
    private OrderDetailDAO orderDetailDAO;

    @Inject
    private OrderDAO orderDAO;

    @Inject
    private ProductDAO productDAO;

    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailDAO.listAll();
    }

    public OrderDetail getOrderDetail(Integer orderNumber) {
        return orderDetailDAO.read(orderDAO.read(orderNumber));
    }

    @Override
    public List<OrderDetail> getOrderDetailsByOrder(Integer orderNumber) {

       return orderDetailDAO.orderDetailByOrder(orderDAO.read(orderNumber));
    }

    @Override
    public List<OrderDetail> getOrderDetailsByProduct(String checkNumber) {
        return orderDetailDAO.orderDetailByProduct(productDAO.read(checkNumber));
    }

    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailDAO.insert(orderDetail);
    }

    public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailDAO.insert(orderDetail);
    }

    public boolean deleteOrderDetail(Integer orderNumber) {
        return orderDetailDAO.deleteById(orderDAO.read(orderNumber));
    }
}
