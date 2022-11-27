package io.classicmodels.entity;

import lombok.AccessLevel;
import lombok.Setter;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {

    @Id
    @Column(name = "orderNumber", nullable = false)
    @JsonbProperty(value = "orderNumber")
    private int orderNumber;

    @Column(name = "quantityOrdered")
    private int quantityOrdered;
    @Column(name = "priceEach")
    private BigDecimal priceEach;
    @Column(name = "orderLineNumber")
    private short orderLineNumber;
    @ManyToOne
    @JoinColumn(name = "orderNumber", referencedColumnName = "orderNumber")
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "productCode", referencedColumnName = "productCode")
    private Product product;


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
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


    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
