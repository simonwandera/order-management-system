package io.classicmodels.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@IdClass(OrderdetailsPK.class)
public class Orderdetail extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderNumber")
    private int orderNumber;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productCode")
    private String productCode;
    @Basic
    @Column(name = "quantityOrdered")
    private int quantityOrdered;
    @Basic
    @Column(name = "priceEach")
    private BigDecimal priceEach;
    @Basic
    @Column(name = "orderLineNumber")
    private short orderLineNumber;
    @ManyToOne
    @JoinColumn(name = "orderNumber", referencedColumnName = "orderNumber", nullable = false)
    private Orders ordersByOrderNumber;
    @ManyToOne
    @JoinColumn(name = "productCode", referencedColumnName = "productCode", nullable = false)
    private Product productByProductCode;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    public short getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(short orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderdetail that = (Orderdetail) o;

        if (orderNumber != that.orderNumber) return false;
        if (quantityOrdered != that.quantityOrdered) return false;
        if (orderLineNumber != that.orderLineNumber) return false;
        if (productCode != null ? !productCode.equals(that.productCode) : that.productCode != null) return false;
        if (priceEach != null ? !priceEach.equals(that.priceEach) : that.priceEach != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNumber;
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        result = 31 * result + quantityOrdered;
        result = 31 * result + (priceEach != null ? priceEach.hashCode() : 0);
        result = 31 * result + (int) orderLineNumber;
        return result;
    }

    public Orders getOrdersByOrderNumber() {
        return ordersByOrderNumber;
    }

    public void setOrdersByOrderNumber(Orders ordersByOrderNumber) {
        this.ordersByOrderNumber = ordersByOrderNumber;
    }

    public Product getProductsByProductCode() {
        return productByProductCode;
    }

    public void setProductsByProductCode(Product productByProductCode) {
        this.productByProductCode = productByProductCode;
    }
}
