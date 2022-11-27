package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.CustomerDAO;
import io.classicmodels.entity.Customer;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class CustomerDAOImpl extends BaseDAOImpl<Customer, Integer> implements CustomerDAO {

    @Inject
    private EntityManager entityManager;

    protected CustomerDAOImpl() {
        super(Customer.class);
    }
}
