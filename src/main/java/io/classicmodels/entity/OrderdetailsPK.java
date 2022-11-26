package io.classicmodels.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderdetailsPK implements Serializable {
    @Column(name = "orderNumber")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNumber;
    @Column(name = "productCode")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productCode;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderdetailsPK that = (OrderdetailsPK) o;

        if (orderNumber != that.orderNumber) return false;
        if (productCode != null ? !productCode.equals(that.productCode) : that.productCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNumber;
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        return result;
    }
}
