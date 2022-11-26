package io.classicmodels.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Customers extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customerNumber")
    private int customerNumber;
    @Basic
    @Column(name = "customerName")
    private String customerName;
    @Basic
    @Column(name = "contactLastName")
    private String contactLastName;
    @Basic
    @Column(name = "contactFirstName")
    private String contactFirstName;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "addressLine1")
    private String addressLine1;
    @Basic
    @Column(name = "addressLine2")
    private String addressLine2;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "postalCode")
    private String postalCode;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;
    @Basic
    @Column(name = "creditLimit")
    private BigDecimal creditLimit;
    @ManyToOne
    @JoinColumn(name = "salesRepEmployeeNumber", referencedColumnName = "employeeNumber")
    private Employees employeesBySalesRepEmployeeNumber;
    @OneToMany(mappedBy = "customersByCustomerNumber")
    private Collection<Orders> ordersByCustomerNumber;
    @OneToMany(mappedBy = "customersByCustomerNumber")
    private Collection<Payments> paymentsByCustomerNumber;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        if (customerNumber != customers.customerNumber) return false;
        if (customerName != null ? !customerName.equals(customers.customerName) : customers.customerName != null)
            return false;
        if (contactLastName != null ? !contactLastName.equals(customers.contactLastName) : customers.contactLastName != null)
            return false;
        if (contactFirstName != null ? !contactFirstName.equals(customers.contactFirstName) : customers.contactFirstName != null)
            return false;
        if (phone != null ? !phone.equals(customers.phone) : customers.phone != null) return false;
        if (addressLine1 != null ? !addressLine1.equals(customers.addressLine1) : customers.addressLine1 != null)
            return false;
        if (addressLine2 != null ? !addressLine2.equals(customers.addressLine2) : customers.addressLine2 != null)
            return false;
        if (city != null ? !city.equals(customers.city) : customers.city != null) return false;
        if (state != null ? !state.equals(customers.state) : customers.state != null) return false;
        if (postalCode != null ? !postalCode.equals(customers.postalCode) : customers.postalCode != null) return false;
        if (country != null ? !country.equals(customers.country) : customers.country != null) return false;
        if (salesRepEmployeeNumber != null ? !salesRepEmployeeNumber.equals(customers.salesRepEmployeeNumber) : customers.salesRepEmployeeNumber != null)
            return false;
        if (creditLimit != null ? !creditLimit.equals(customers.creditLimit) : customers.creditLimit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerNumber;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (contactLastName != null ? contactLastName.hashCode() : 0);
        result = 31 * result + (contactFirstName != null ? contactFirstName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (salesRepEmployeeNumber != null ? salesRepEmployeeNumber.hashCode() : 0);
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        return result;
    }

    public Employees getEmployeesBySalesRepEmployeeNumber() {
        return employeesBySalesRepEmployeeNumber;
    }

    public void setEmployeesBySalesRepEmployeeNumber(Employees employeesBySalesRepEmployeeNumber) {
        this.employeesBySalesRepEmployeeNumber = employeesBySalesRepEmployeeNumber;
    }

    public Collection<Orders> getOrdersByCustomerNumber() {
        return ordersByCustomerNumber;
    }

    public void setOrdersByCustomerNumber(Collection<Orders> ordersByCustomerNumber) {
        this.ordersByCustomerNumber = ordersByCustomerNumber;
    }

    public Collection<Payments> getPaymentsByCustomerNumber() {
        return paymentsByCustomerNumber;
    }

    public void setPaymentsByCustomerNumber(Collection<Payments> paymentsByCustomerNumber) {
        this.paymentsByCustomerNumber = paymentsByCustomerNumber;
    }
}
