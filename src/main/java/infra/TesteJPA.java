/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TesteJPA {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinicaup");
        EntityManager em = emf.createEntityManager();
        Usuario user = new Usuario();
        user.setEmail("paulo@gmail.com");
        user.setSenha("1234");
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(user);
        et.commit();
        em.close();
        emf.close();
    }
}
