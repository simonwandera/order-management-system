package io.classicmodels.service;

import io.classicmodels.entity.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment getPayment(String checkNumber);

    Payment createPayment(Payment payment);

    Payment updatePayment(Payment payment);

    boolean deletePayment(String checkNumber);
}
