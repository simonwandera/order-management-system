package io.classicmodels.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productlines")
public class ProductLine extends BaseEntity {

    @Column(name = "textDescription")
    private String textDescription;
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Column(name = "image")
    private String image;
    @OneToMany(mappedBy = "productline", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Product> productByProductLine;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Product> getProductsByProductLine() {
        return productByProductLine;
    }

    public void setProductsByProductLine(List<Product> productByProductLine) {
        this.productByProductLine = productByProductLine;
    }

}
