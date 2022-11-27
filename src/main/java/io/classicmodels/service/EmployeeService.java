package io.classicmodels.service;

import io.classicmodels.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee getEmployee(Integer employeeNumber);

    Employee updateEmployee(Employee employee);

    boolean deleteEmployee(Integer employeeNumber);
}
