package jeddicttest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JeddictTest {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEFAULT_PU");

        EntityManager em = emf.createEntityManager();
 
 
        em.getTransaction().begin();
        
        
        em.getTransaction().commit();
        
        
        
//        Query query = em.createQuery("SELECT a FROM Customer a");
//        Query query2 = em.createNamedQuery("Customer.findById");
//
//        query2.setParameter("id", 51);
//        Customer customer = (Customer) query2.getSingleResult();
//
//        System.out.println(customer);
    }

}
//     List <Artist> artists= (List<Artist>) query2.getResultList();
