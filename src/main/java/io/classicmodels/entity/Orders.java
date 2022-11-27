package io.classicmodels.entity;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
public class Orders extends BaseEntity {

    @Column(name = "orderDate")
    private LocalDate orderDate;

    @Column(name = "requiredDate")
    private LocalDate requiredDate;

    @Column(name = "shippedDate")
    private LocalDate shippedDate;
    @Column(name = "status")
    private String status;
    @Column(name = "comments")
    private String comments;

    @ManyToOne
    @JoinColumn(name = "customerNumber", referencedColumnName = "id")
    private Customers customers;

    @OneToMany(mappedBy = "orders", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetail;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
}
