package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.EmployeeDAO;
import io.classicmodels.entity.Employee;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class EmployeeDAOImpl extends BaseDAOImpl<Employee, Integer> implements EmployeeDAO {

    @Inject
    private EntityManager entityManager;

    protected EmployeeDAOImpl() {
        super(Employee.class);
    }
}
