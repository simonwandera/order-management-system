package io.classicmodels.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "orderNumber", referencedColumnName = "orderNumber", nullable = false)
    @JsonbProperty(value = "orderNumber")
    private Order order;

    @Column(name = "quantityOrdered")
    private Integer quantityOrdered;
    @Column(name = "priceEach")
    private BigDecimal priceEach;
    @Column(name = "orderLineNumber")
    private short orderLineNumber;

    @ManyToOne
    @JoinColumn(name = "productCode", referencedColumnName = "productCode")
    private Product product;

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
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


    public Order getOrders() {
        return order;
    }

    public void setOrders(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
