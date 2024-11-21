package pe.edu.i202221115.clases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221115.entity.City;
import pe.edu.i202221115.entity.Country;
import pe.edu.i202221115.entity.CountryLanguage;


public class JPAPersist {
    public static void main(String[] args) {

        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-pillcoporlles-david");
        EntityManager em = emf.createEntityManager();



        // Crear el país imaginario
        Country country = new Country();
        country.setCode("AAA");  // Código del país
        country.setName("Imaginaria");
        country.setContinent("Asia");
        country.setRegion("Oeste");
        country.setSurfaceArea(20.40);
        country.setIndepyear(33);
        country.setPopulation(15000000);
        country.setLifeExpectancy(30.44);
        country.setGnp(23.32);
        country.setGnpOld(4.4);
        country.setLocalName("dd");
        country.setGovernmentForm("ss");
        country.setHeadOfState("gfg");
        country.setCapital(32);
        country.setCode2("s2");


        // Crear las ciudades
        City city1 = new City();
        city1.setName("Ciudad1");
        city1.setDistrict("distrito1");
        city1.setCountry(country);
        city1.setPopulation(1000000);

        City city2 = new City();
        city2.setName("Ciudad2");
        city2.setDistrict("distrito2");
        city2.setCountry(country);
        city2.setPopulation(800000);

        City city3 = new City();
        city3.setName("Ciudad3");
        city3.setDistrict("distrito3");
        city3.setCountry(country);
        city3.setPopulation(1200000);

        // Crear los idiomas nativos
        CountryLanguage language1 = new CountryLanguage();
        language1.setLanguage("ImaginarioLang1");
        language1.setIsOfficial("nativo1");
        language1.setCountry(country);
        language1.setPercentage(24.42);

        CountryLanguage language2 = new CountryLanguage();
        language2.setLanguage("ImaginarioLang2");
        language2.setIsOfficial("nativo2");
        language2.setCountry(country);
        language2.setPercentage(25.42);


        em.getTransaction().begin();
        em.persist(country);
        em.persist(city1);
        em.persist(city2);
        em.persist(city3);
        em.persist(language1);
        em.persist(language2);
        em.getTransaction().commit();



    }
}
