package io.classicmodels.service.impl;

import io.classicmodels.DAO.ProductDAO;
import io.classicmodels.entity.Product;
import io.classicmodels.service.ProductService;

import javax.inject.Inject;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDAO productDAO;

    @Override
    public List<Product> getAllProducts() {
        return productDAO.listAll();
    }

    @Override
    public Product getProduct(String productCode) {
        return productDAO.read(productCode);
    }

    @Override
    public Product createProduct(Product product) {
        return productDAO.insert(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productDAO.insert(product);
    }

    @Override
    public boolean deleteProduct(String productCode) {
        return productDAO.deleteById(productCode);
    }
}
