package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.CustomerDAO;
import io.classicmodels.entity.Customer;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomerDAOImpl extends BaseDAOImpl<Customer, Integer> implements CustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected CustomerDAOImpl() {
        super(Customer.class);
    }
}
