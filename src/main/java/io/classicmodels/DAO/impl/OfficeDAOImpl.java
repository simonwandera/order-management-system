package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OfficeDAO;
import io.classicmodels.entity.Office;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OfficeDAOImpl extends BaseDAOImpl<Office, String> implements OfficeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected OfficeDAOImpl() {
        super(Office.class);
    }
}
