package io.classicmodels.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employees  extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employeeNumber")
    private int employeeNumber;
    @Basic
    @Column(name = "lastName")
    private String lastName;
    @Basic
    @Column(name = "firstName")
    private String firstName;
    @Basic
    @Column(name = "extension")
    private String extension;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "officeCode")
    private String officeCode;
    @Basic
    @Column(name = "reportsTo")
    private Integer reportsTo;
    @Basic
    @Column(name = "jobTitle")
    private String jobTitle;
    @OneToMany(mappedBy = "employeesBySalesRepEmployeeNumber")
    private Collection<Customer> customerByEmployeeNumber;
    @ManyToOne
    @JoinColumn(name = "officeCode", referencedColumnName = "officeCode", nullable = false)
    private Offices officesByOfficeCode;
    @ManyToOne
    @JoinColumn(name = "reportsTo", referencedColumnName = "employeeNumber")
    private Employees employeesByReportsTo;
    @OneToMany(mappedBy = "employeesByReportsTo")
    private Collection<Employees> employeesByEmployeeNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (employeeNumber != employees.employeeNumber) return false;
        if (lastName != null ? !lastName.equals(employees.lastName) : employees.lastName != null) return false;
        if (firstName != null ? !firstName.equals(employees.firstName) : employees.firstName != null) return false;
        if (extension != null ? !extension.equals(employees.extension) : employees.extension != null) return false;
        if (email != null ? !email.equals(employees.email) : employees.email != null) return false;
        if (officeCode != null ? !officeCode.equals(employees.officeCode) : employees.officeCode != null) return false;
        if (reportsTo != null ? !reportsTo.equals(employees.reportsTo) : employees.reportsTo != null) return false;
        if (jobTitle != null ? !jobTitle.equals(employees.jobTitle) : employees.jobTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeNumber;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (officeCode != null ? officeCode.hashCode() : 0);
        result = 31 * result + (reportsTo != null ? reportsTo.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        return result;
    }

    public Collection<Customer> getCustomersByEmployeeNumber() {
        return customerByEmployeeNumber;
    }

    public void setCustomersByEmployeeNumber(Collection<Customer> customerByEmployeeNumber) {
        this.customerByEmployeeNumber = customerByEmployeeNumber;
    }

    public Offices getOfficesByOfficeCode() {
        return officesByOfficeCode;
    }

    public void setOfficesByOfficeCode(Offices officesByOfficeCode) {
        this.officesByOfficeCode = officesByOfficeCode;
    }

    public Employees getEmployeesByReportsTo() {
        return employeesByReportsTo;
    }

    public void setEmployeesByReportsTo(Employees employeesByReportsTo) {
        this.employeesByReportsTo = employeesByReportsTo;
    }

    public Collection<Employees> getEmployeesByEmployeeNumber() {
        return employeesByEmployeeNumber;
    }

    public void setEmployeesByEmployeeNumber(Collection<Employees> employeesByEmployeeNumber) {
        this.employeesByEmployeeNumber = employeesByEmployeeNumber;
    }
}
