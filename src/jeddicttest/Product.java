package jeddicttest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author User
 */
@Entity

@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT a FROM Product a")
    , @NamedQuery(name = "Product.findById", query = "SELECT a FROM Product a WHERE a.id = :id")
    , @NamedQuery(name = "Product.retailPrice", query = "SELECT a FROM Product a WHERE a.retailPrice= :retailPrice")
    })
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String description;

    @Basic
    private String retailPrice;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

}