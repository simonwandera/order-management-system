package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.EmployeeDAO;
import io.classicmodels.entity.Employee;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmployeeDAOImpl extends BaseDAOImpl<Employee, Integer> implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected EmployeeDAOImpl() {
        super(Employee.class);
    }
}
