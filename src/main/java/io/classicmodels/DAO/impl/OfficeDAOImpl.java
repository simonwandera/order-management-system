package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.OfficeDAO;
import io.classicmodels.entity.Office;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class OfficeDAOImpl extends BaseDAOImpl<Office, String> implements OfficeDAO {
    @Inject
    private EntityManager entityManager;

    protected OfficeDAOImpl() {
        super(Office.class);
    }
}
