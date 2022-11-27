package io.classicmodels.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orderdetails")
public class OrderDetail extends BaseEntity {

    @Column(name = "quantityOrdered")
    private int quantityOrdered;
    @Column(name = "priceEach")
    private BigDecimal priceEach;
    @Column(name = "orderLineNumber")
    private short orderLineNumber;
    @ManyToOne
    @JoinColumn(name = "orderNumber", referencedColumnName = "id")
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "productCode", referencedColumnName = "id")
    private Product product;


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
