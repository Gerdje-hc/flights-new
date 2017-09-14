package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.nio.file.Files;


/*  Ondertstaande code wordt automatisch gegenereerd door Spring
*//**
 * Created by vdabcursist on 12/09/2017.
 *//*
@Repository
@Transactional

public class FlightRepository {

    @PersistenceContext// Spring kan hiermede automatisch de juiste Entity Manager aanmaken wanneer nodig
    private EntityManager em;    // aanmaken van een Entity Manager

    public void save(Flight f) {
        em.persist(f);

    }
    // Query wordt opgevraagd en weergegeven aan de user

    public Flight queryByFlightNumber(String flightNumber) {
        TypedQuery<Flight> query = em.createQuery("select f from Flight f where f.flightNumber = :placeholder", Flight.class);
        query.setParameter("placeholder", flightNumber);
        return query.getSingleResult();

    }
}*/

public interface FlightRepository extends JpaRepository<Flight, Integer> {   // De subclasses voor deze interface worden automatisch geimplementeerd door spring


    Flight readByFlightNumber (String flightNumber);
    Flight getByDepartureAndDestination (String dep, String des);



    }


