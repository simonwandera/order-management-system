package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OrderDAO;
import io.classicmodels.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderDAOImpl extends BaseDAOImpl<Order, Integer> implements OrderDAO {
    @PersistenceContext
    private EntityManager entityManager;


    protected OrderDAOImpl() {
        super(Order.class);
    }
}