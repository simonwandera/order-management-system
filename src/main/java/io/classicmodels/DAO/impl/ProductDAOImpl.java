package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.entity.Product;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class ProductDAOImpl extends BaseDAOImpl<Product, String> implements ProductDAO {

    @Inject
    private EntityManager entityManager;

    protected ProductDAOImpl() {
        super(Product.class);
    }
}
