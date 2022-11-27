package io.classicmodels.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment implements Serializable {

    @Id
    @Column(name = "checkNumber", nullable = false, length = 50)
    private String checkNumber;

    @Column(name = "paymentDate")
    private LocalDate paymentDate;
    @Column(name = "amount")
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "customerNumber", referencedColumnName = "customerNumber", nullable = false)
    private Customer customer;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
