package io.classicmodels.service.impl;

import io.classicmodels.DAO.ProductLineDAO;
import io.classicmodels.entity.ProductLine;
import io.classicmodels.service.ProductLineService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class ProductLineServiceImpl implements ProductLineService {

    @Inject
    private ProductLineDAO productLineDAO;

    @Override
    public List<ProductLine> getAllProductLines() {
        return productLineDAO.listAll();
    }

    @Override
    public ProductLine getProductLine(String id) {
        return productLineDAO.read(id);
    }

    @Override
    public ProductLine createProductLine(ProductLine productLine) {
        return productLineDAO.insert(productLine);
    }

    @Override
    public ProductLine updateProductLine(ProductLine productLine) {
        return productLineDAO.insert(productLine);
    }

    @Override
    public boolean deleteProductLine(String id) {
        return productLineDAO.deleteById(id);
    }
}
