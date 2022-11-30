package io.classicmodels.DAO;

import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;
import io.classicmodels.entity.Product;

import java.util.List;

public interface OrderDetailDAO extends BaseDAO<OrderDetail, Order> {
    List<OrderDetail> orderDetailByOrder(Order order);

    List<OrderDetail> orderDetailByProduct(Product product);


}
