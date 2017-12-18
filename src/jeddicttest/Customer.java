
package jeddicttest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT a FROM Customer a")
    , @NamedQuery(name = "Customer.findById", query = "SELECT a FROM Customer a WHERE a.id = :id")
    , @NamedQuery(name = "Customer.findByLastName", query = "SELECT a FROM Customer a WHERE a.lastName = :lastName")
    })
    
public class Customer implements Serializable {

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FNAME")
    @Basic
    private String firstName;

    @Column(name = "LNAME")
    @Basic
    private String lastName;

  
    @OneToMany(targetEntity = ProductOrder.class)
    @JoinColumn(name = "CUSTOMER_ID")
    private List<ProductOrder> productOrders;

    
    
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ProductOrder> getProductOrders() {
        return this.productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

}