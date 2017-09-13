package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class TicketService {

        @Autowired                      // Spring kan hiermee gebruik maken van de TicketRepository om een ticket te creeren
        private TicketRepository ticketRepository;

        public Ticket create(Flight flight, Passenger passenger, double price){
                System.out.println("New ticket created");
                return null;
        }

}

