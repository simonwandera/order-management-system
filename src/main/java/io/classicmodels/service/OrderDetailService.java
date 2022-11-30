package io.classicmodels.service;

import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;
import io.classicmodels.entity.Product;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetails();

    OrderDetail getOrderDetail(Integer orderNumber);

    List<OrderDetail> getOrderDetailsByOrder(Integer orderNumber);
    List<OrderDetail> getOrderDetailsByProduct(String checkNumber);

    OrderDetail createOrderDetail(OrderDetail orderDetail);

    OrderDetail updateOrderDetail(OrderDetail orderDetail);

    boolean deleteOrderDetail(Integer orderNumber);

}
