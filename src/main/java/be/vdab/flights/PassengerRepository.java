package be.vdab.flights;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository  // SPRING COMPONENT
@Transactional   // Dit geeft Spring de opdracht om alle transacties tegelijk te laten gebeuren zodat er steeds

public class PassengerRepository {


    @PersistenceContext           // Spring kan hiermede automatisch de juiste Entity Manager aanmaken wanneer nodig
    private EntityManager em;    // aanmaken van een Entity Manager

    public Passenger readbyId(int id){
        return null;

    }



    public List<String> findAll() {   // test om te kijken of er field worden toegevoegd in de database
        List<String> passengerList = new ArrayList<>();

        passengerList.add("John");
        passengerList.add("Marie");

        return passengerList;
    }
    public void save (Passenger p){    // Passengers kunnen nu aangemaakt worden via de entity manager em - persist > is doorsturen
        em.persist(p);


    }

    public List<Passenger> findall(){
       return em.createQuery("select p from Passenger p ORDER BY first_name", Passenger.class).getResultList();

    }


}





