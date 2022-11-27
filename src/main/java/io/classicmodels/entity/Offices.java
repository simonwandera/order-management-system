package io.classicmodels.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "offices")
public class Offices  extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "officeCode")
    private String officeCode;
    @Basic
    @Column(name = "city")
    private String city;
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
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "postalCode")
    private String postalCode;
    @Basic
    @Column(name = "territory")
    private String territory;
    @OneToMany(mappedBy = "officesByOfficeCode")
    private Collection<Employees> employeesByOfficeCode;

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offices offices = (Offices) o;

        if (officeCode != null ? !officeCode.equals(offices.officeCode) : offices.officeCode != null) return false;
        if (city != null ? !city.equals(offices.city) : offices.city != null) return false;
        if (phone != null ? !phone.equals(offices.phone) : offices.phone != null) return false;
        if (addressLine1 != null ? !addressLine1.equals(offices.addressLine1) : offices.addressLine1 != null)
            return false;
        if (addressLine2 != null ? !addressLine2.equals(offices.addressLine2) : offices.addressLine2 != null)
            return false;
        if (state != null ? !state.equals(offices.state) : offices.state != null) return false;
        if (country != null ? !country.equals(offices.country) : offices.country != null) return false;
        if (postalCode != null ? !postalCode.equals(offices.postalCode) : offices.postalCode != null) return false;
        if (territory != null ? !territory.equals(offices.territory) : offices.territory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = officeCode != null ? officeCode.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (territory != null ? territory.hashCode() : 0);
        return result;
    }

    public Collection<Employees> getEmployeesByOfficeCode() {
        return employeesByOfficeCode;
    }

    public void setEmployeesByOfficeCode(Collection<Employees> employeesByOfficeCode) {
        this.employeesByOfficeCode = employeesByOfficeCode;
    }
}
