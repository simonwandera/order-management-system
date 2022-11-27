package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OrderDetailDAO;
import io.classicmodels.entity.Order;
import io.classicmodels.entity.OrderDetail;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class OrderDetailDAOImpl extends BaseDAOImpl<OrderDetail, Order> implements OrderDetailDAO {

    @Inject
    private EntityManager entityManager;

    protected OrderDetailDAOImpl() {
        super(OrderDetail.class);
    }
}
