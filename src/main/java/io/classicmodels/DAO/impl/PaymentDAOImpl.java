package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.PaymentDAO;
import io.classicmodels.entity.Payment;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class PaymentDAOImpl extends BaseDAOImpl<Payment, String> implements PaymentDAO {

    @Inject
    private EntityManager entityManager;

    protected PaymentDAOImpl() {
        super(Payment.class);
    }
}
