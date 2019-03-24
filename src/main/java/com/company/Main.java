package com.company;

import com.company.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();

        Client client = new Client();
        client.setName("Ivan");

        em.getTransaction().begin();

        em.persist(client);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
