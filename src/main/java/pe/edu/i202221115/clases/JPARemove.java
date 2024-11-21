package pe.edu.i202221115.clases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221115.entity.Country;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-pillcoporlles-david");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Country country = em.find(Country.class, "AAA"); // Cambia el ID según tu registro
        em.remove(country);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
