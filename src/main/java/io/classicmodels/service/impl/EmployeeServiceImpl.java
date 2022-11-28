package io.classicmodels.service.impl;

import io.classicmodels.DAO.EmployeeDAO;
import io.classicmodels.entity.Employee;
import io.classicmodels.service.EmployeeService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class EmployeeServiceImpl implements EmployeeService {

    @Inject
    private EmployeeDAO employeeDAO;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.listAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDAO.insert(employee);
    }

    @Override
    public Employee getEmployee(Integer employeeNumber) {
        return employeeDAO.read(employeeNumber);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.insert(employee);
    }

    @Override
    public boolean deleteEmployee(Integer employeeNumber) {
        return employeeDAO.deleteById(employeeNumber);
    }
}
