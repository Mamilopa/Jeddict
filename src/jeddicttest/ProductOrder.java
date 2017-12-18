
package jeddicttest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author User
 */
@Entity

@NamedQueries({
    @NamedQuery(name = "ProductOrder.findAll", query = "SELECT a FROM ProductOrder a")
    , @NamedQuery(name = "ProductOrder.findById", query = "SELECT a FROM ProductOrder a WHERE a.id = :id")
    , @NamedQuery(name = "ProductOrder.amount", query = "SELECT a FROM ProductOrder a WHERE a.amount= :amount")
    })
public class ProductOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String amount;

    @ManyToMany(targetEntity = Product.class)
    @JoinTable(name = "PRODUCTORDER_PRODUCT")
    private List<Product> products;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}