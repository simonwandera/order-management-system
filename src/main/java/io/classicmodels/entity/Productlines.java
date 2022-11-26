package io.classicmodels.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Productlines  extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productLine")
    private String productLine;
    @Basic
    @Column(name = "textDescription")
    private String textDescription;
    @Basic
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Basic
    @Column(name = "image")
    private byte[] image;
    @OneToMany(mappedBy = "productlinesByProductLine")
    private Collection<Products> productsByProductLine;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Productlines that = (Productlines) o;

        if (productLine != null ? !productLine.equals(that.productLine) : that.productLine != null) return false;
        if (textDescription != null ? !textDescription.equals(that.textDescription) : that.textDescription != null)
            return false;
        if (htmlDescription != null ? !htmlDescription.equals(that.htmlDescription) : that.htmlDescription != null)
            return false;
        if (!Arrays.equals(image, that.image)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productLine != null ? productLine.hashCode() : 0;
        result = 31 * result + (textDescription != null ? textDescription.hashCode() : 0);
        result = 31 * result + (htmlDescription != null ? htmlDescription.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    public Collection<Products> getProductsByProductLine() {
        return productsByProductLine;
    }

    public void setProductsByProductLine(Collection<Products> productsByProductLine) {
        this.productsByProductLine = productsByProductLine;
    }
}
