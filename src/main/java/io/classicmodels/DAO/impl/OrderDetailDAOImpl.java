package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OrderDetailDAO;
import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderDetailDAOImpl extends BaseDAOImpl<OrderDetail, Order> implements OrderDetailDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected OrderDetailDAOImpl() {
        super(OrderDetail.class);
    }
}
