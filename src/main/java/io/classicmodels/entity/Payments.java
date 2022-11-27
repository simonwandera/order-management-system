package io.classicmodels.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@IdClass(PaymentsPK.class)
public class Payments extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customerNumber")
    private int customerNumber;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "checkNumber")
    private String checkNumber;
    @Basic
    @Column(name = "paymentDate")
    private Date paymentDate;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "customerNumber", referencedColumnName = "customerNumber", nullable = false)
    private Customer customerByCustomerNumber;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payments payments = (Payments) o;

        if (customerNumber != payments.customerNumber) return false;
        if (checkNumber != null ? !checkNumber.equals(payments.checkNumber) : payments.checkNumber != null)
            return false;
        if (paymentDate != null ? !paymentDate.equals(payments.paymentDate) : payments.paymentDate != null)
            return false;
        if (amount != null ? !amount.equals(payments.amount) : payments.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerNumber;
        result = 31 * result + (checkNumber != null ? checkNumber.hashCode() : 0);
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    public Customer getCustomersByCustomerNumber() {
        return customerByCustomerNumber;
    }

    public void setCustomersByCustomerNumber(Customer customerByCustomerNumber) {
        this.customerByCustomerNumber = customerByCustomerNumber;
    }
}
