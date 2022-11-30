package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OrderDAO;
import io.classicmodels.DAO.OrderDetailDAO;
import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;
import io.classicmodels.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderDetailDAOImpl extends BaseDAOImpl<OrderDetail, Order> implements OrderDetailDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected OrderDetailDAOImpl() {
        super(OrderDetail.class);
    }

    @Override
    public List<OrderDetail> orderDetailByOrder(Order order) {
        return entityManager.createQuery("SELECT o FROM OrderDetail o WHERE o.order.orderNumber=:orderNumber", OrderDetail.class)
                .setParameter("orderNumber", order.getOrderNumber())
                .getResultList();
    }

    @Override
    public List<OrderDetail> orderDetailByProduct(Product product) {
        return entityManager.createQuery("SELECT o FROM OrderDetail o WHERE o.product.productCode=:productCode", OrderDetail.class)
                .setParameter("productCode", product.getProductCode())
                .getResultList();
    }
}
