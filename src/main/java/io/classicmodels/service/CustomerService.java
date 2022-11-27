package io.classicmodels.service;

import io.classicmodels.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);

    Customer getCustomer(Integer customerNumber);

    Customer updateCustomer(Customer customer);

    boolean deleteCustomer(Integer customerNumber);

}
