package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.DAO.ProductLineDAO;
import io.classicmodels.entity.ProductLine;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProductLineDAOImpl extends BaseDAOImpl<ProductLine, String> implements ProductLineDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected ProductLineDAOImpl() {
        super(ProductLine.class);
    }
}
