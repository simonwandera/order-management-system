package io.classicmodels.service.impl;

import io.classicmodels.DAO.CustomerDAO;
import io.classicmodels.entity.Customer;
import io.classicmodels.service.CustomerService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.listAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDAO.insert(customer);
    }

    @Override
    public Customer getCustomer(Integer customerNumber) {
        return customerDAO.read(customerNumber);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDAO.insert(customer);
    }

    @Override
    public boolean deleteCustomer(Integer customerNumber) {
        return customerDAO.deleteById(customerNumber);
    }
}
