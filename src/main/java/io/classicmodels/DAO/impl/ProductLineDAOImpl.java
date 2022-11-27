package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.DAO.ProductLineDAO;
import io.classicmodels.entity.ProductLine;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class ProductLineDAOImpl extends BaseDAOImpl<ProductLine, String> implements ProductLineDAO {

    @Inject
    private EntityManager entityManager;

    protected ProductLineDAOImpl() {
        super(ProductLine.class);
    }
}
