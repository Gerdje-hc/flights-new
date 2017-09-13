package be.vdab.flights;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
@Transactional
public class TicketRepository {

    @PersistenceContext           // Spring kan hiermede automatisch de juiste Entity Manager aanmaken wanneer nodig
    private EntityManager em;    // aanmaken van een Entity Manager


    public void save (Ticket t){    // Tickets kunnen nu aangemaakt worden via de entity manager em - persist > is doorsturen
        em.persist(t);
    }


}
