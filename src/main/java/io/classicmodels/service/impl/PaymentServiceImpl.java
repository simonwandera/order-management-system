package io.classicmodels.service.impl;

import io.classicmodels.DAO.PaymentDAO;
import io.classicmodels.entity.Payment;
import io.classicmodels.service.PaymentService;

import javax.inject.Inject;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Inject
    private PaymentDAO paymentDAO;
    @Override
    public List<Payment> getAllPayments() {
        return paymentDAO.listAll();
    }

    @Override
    public Payment getPayment(String checkNumber) {
        return paymentDAO.read(checkNumber);
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentDAO.insert(payment);
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return paymentDAO.insert(payment);
    }

    @Override
    public boolean deletePayment(String checkNumber) {
        return paymentDAO.deleteById(checkNumber);
    }
}
