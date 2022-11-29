package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProductDAOImpl extends BaseDAOImpl<Product, String> implements ProductDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected ProductDAOImpl() {
        super(Product.class);
    }
}
