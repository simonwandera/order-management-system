package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OrderDAO;
import io.classicmodels.entity.Order;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class OrderDAOImpl extends BaseDAOImpl<Order, Integer> implements OrderDAO {
    @Inject
    private EntityManager entityManager;


    protected OrderDAOImpl() {
        super(Order.class);
    }
}