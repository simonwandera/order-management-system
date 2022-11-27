package io.classicmodels.service;

import io.classicmodels.entity.Product;
import io.classicmodels.entity.ProductLine;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProduct(String productCode);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    boolean deleteProduct(String productCode);
}
