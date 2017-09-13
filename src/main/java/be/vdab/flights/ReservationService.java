package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class ReservationService {

    @Autowired   // Spring maakt hiermee de link naar de PassengerService > de ReservationServic heeft een PassengerService nodig
    private PassengerService passengerService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private FlightService flightService;

    public ReservationService bookTicketForFlght(Passenger p, Flight f){
        System.out.println("Book ticket");
        return null;
    }


}
