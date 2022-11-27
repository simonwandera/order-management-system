package io.classicmodels.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @Column(name = "productCode", nullable = false, length = 50)
    private String productCode;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productScale")
    private String productScale;
    @Column(name = "productVendor")
    private String productVendor;
    @Column(name = "productDescription")
    private String productDescription;
    @Column(name = "quantityInStock")
    private int quantityInStock;
    @Column(name = "buyPrice")
    private BigDecimal buyPrice;
    @Column(name = "MSRP")
    private BigDecimal msrp;

    @ManyToOne
    @JoinColumn(name = "productLine", referencedColumnName = "productLine")
    private ProductLine productline;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetail;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderdetail) {
        this.orderDetail = orderdetail;
    }

    public ProductLine getProductline() {
        return productline;
    }

    public void setProductline(ProductLine productLineByProductLine) {
        this.productline = productLineByProductLine;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
