package io.classicmodels.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Orders extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderNumber")
    private int orderNumber;
    @Basic
    @Column(name = "orderDate")
    private Date orderDate;
    @Basic
    @Column(name = "requiredDate")
    private Date requiredDate;
    @Basic
    @Column(name = "shippedDate")
    private Date shippedDate;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "comments")
    private String comments;
    @Basic
    @Column(name = "customerNumber")
    private int customerNumber;
    @OneToMany(mappedBy = "ordersByOrderNumber")
    private Collection<Orderdetails> orderdetailsByOrderNumber;
    @ManyToOne
    @JoinColumn(name = "customerNumber", referencedColumnName = "customerNumber", nullable = false)
    private Customers customersByCustomerNumber;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

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

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (orderNumber != orders.orderNumber) return false;
        if (customerNumber != orders.customerNumber) return false;
        if (orderDate != null ? !orderDate.equals(orders.orderDate) : orders.orderDate != null) return false;
        if (requiredDate != null ? !requiredDate.equals(orders.requiredDate) : orders.requiredDate != null)
            return false;
        if (shippedDate != null ? !shippedDate.equals(orders.shippedDate) : orders.shippedDate != null) return false;
        if (status != null ? !status.equals(orders.status) : orders.status != null) return false;
        if (comments != null ? !comments.equals(orders.comments) : orders.comments != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNumber;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (requiredDate != null ? requiredDate.hashCode() : 0);
        result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + customerNumber;
        return result;
    }

    public Collection<Orderdetails> getOrderdetailsByOrderNumber() {
        return orderdetailsByOrderNumber;
    }

    public void setOrderdetailsByOrderNumber(Collection<Orderdetails> orderdetailsByOrderNumber) {
        this.orderdetailsByOrderNumber = orderdetailsByOrderNumber;
    }

    public Customers getCustomersByCustomerNumber() {
        return customersByCustomerNumber;
    }

    public void setCustomersByCustomerNumber(Customers customersByCustomerNumber) {
        this.customersByCustomerNumber = customersByCustomerNumber;
    }
}
