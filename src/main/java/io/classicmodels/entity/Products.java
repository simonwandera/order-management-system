package io.classicmodels.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Products  extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productCode")
    private String productCode;
    @Basic
    @Column(name = "productName")
    private String productName;
    @Basic
    @Column(name = "productLine")
    private String productLine;
    @Basic
    @Column(name = "productScale")
    private String productScale;
    @Basic
    @Column(name = "productVendor")
    private String productVendor;
    @Basic
    @Column(name = "productDescription")
    private String productDescription;
    @Basic
    @Column(name = "quantityInStock")
    private short quantityInStock;
    @Basic
    @Column(name = "buyPrice")
    private BigDecimal buyPrice;
    @Basic
    @Column(name = "MSRP")
    private BigDecimal msrp;
    @OneToMany(mappedBy = "productsByProductCode")
    private Collection<Orderdetails> orderdetailsByProductCode;
    @ManyToOne
    @JoinColumn(name = "productLine", referencedColumnName = "productLine", nullable = false)
    private Productlines productlinesByProductLine;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public short getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(short quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (quantityInStock != products.quantityInStock) return false;
        if (productCode != null ? !productCode.equals(products.productCode) : products.productCode != null)
            return false;
        if (productName != null ? !productName.equals(products.productName) : products.productName != null)
            return false;
        if (productLine != null ? !productLine.equals(products.productLine) : products.productLine != null)
            return false;
        if (productScale != null ? !productScale.equals(products.productScale) : products.productScale != null)
            return false;
        if (productVendor != null ? !productVendor.equals(products.productVendor) : products.productVendor != null)
            return false;
        if (productDescription != null ? !productDescription.equals(products.productDescription) : products.productDescription != null)
            return false;
        if (buyPrice != null ? !buyPrice.equals(products.buyPrice) : products.buyPrice != null) return false;
        if (msrp != null ? !msrp.equals(products.msrp) : products.msrp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productCode != null ? productCode.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productLine != null ? productLine.hashCode() : 0);
        result = 31 * result + (productScale != null ? productScale.hashCode() : 0);
        result = 31 * result + (productVendor != null ? productVendor.hashCode() : 0);
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        result = 31 * result + (int) quantityInStock;
        result = 31 * result + (buyPrice != null ? buyPrice.hashCode() : 0);
        result = 31 * result + (msrp != null ? msrp.hashCode() : 0);
        return result;
    }

    public Collection<Orderdetails> getOrderdetailsByProductCode() {
        return orderdetailsByProductCode;
    }

    public void setOrderdetailsByProductCode(Collection<Orderdetails> orderdetailsByProductCode) {
        this.orderdetailsByProductCode = orderdetailsByProductCode;
    }

    public Productlines getProductlinesByProductLine() {
        return productlinesByProductLine;
    }

    public void setProductlinesByProductLine(Productlines productlinesByProductLine) {
        this.productlinesByProductLine = productlinesByProductLine;
    }
}
