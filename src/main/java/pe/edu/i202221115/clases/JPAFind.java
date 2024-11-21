package pe.edu.i202221115.clases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221115.entity.Country;

public class JPAFind {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-pillcoporlles-david");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "PER");

        country.getCities().stream()
                .filter(city -> city.getPopulation() > 700000)
                .forEach(city -> System.out.println(city.getName()));

        em.close();
        emf.close();
    }
}
