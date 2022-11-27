package io.classicmodels.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "productlines")
public class ProductLine implements Serializable {

    @Id
    @Size(max = 50)
    @Column(name = "productLine", nullable = false, length = 50)
    @JsonbProperty(value = "productLine")
    private String id;

    @Column(name = "textDescription")
    private String textDescription;
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Column(name = "image")
    private String image;
    @OneToMany(mappedBy = "productline", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Product> products;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
