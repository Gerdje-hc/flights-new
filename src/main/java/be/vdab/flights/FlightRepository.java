package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Repository
@Transactional

public class FlightRepository {

    @PersistenceContext// Spring kan hiermede automatisch de juiste Entity Manager aanmaken wanneer nodig
    private EntityManager em;    // aanmaken van een Entity Manager

    public void save (Flight f){
        em.persist(f);

    }
}
