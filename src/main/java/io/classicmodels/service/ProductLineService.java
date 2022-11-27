package io.classicmodels.service;

import io.classicmodels.entity.ProductLine;

import java.util.List;

public interface ProductLineService {
    List<ProductLine> getAllProductLines();

    ProductLine getProductLine(String id);

    ProductLine createProductLine(ProductLine productLine);

    ProductLine updateProductLine(ProductLine productLine);

    boolean deleteProductLine(String id);
}
