package be.vdab.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);   //de ApplicationContext geeft de toegang (via ac =)tot uw beans

		PassengerService ps = ac.getBean(PassengerService.class);
		ps.getAll();   // 1ste print out
		System.out.println(ps.getAll());  // 2de print out

		//maak de reservatieService
		ReservationService rs = ac.getBean(ReservationService.class);
		rs.bookTicketForFlght(new Passenger("Tony", "Bracket"), new Flight("001"));

		//maak nieuw passenger
		PassengerRepository pr = ac.getBean(PassengerRepository.class);  // new passenger aanmaken
		Passenger p = new Passenger("Jimmy", "Hendrickx");
		pr.save(p);

		//maak nieuw Fight
		FlightRepository fr = ac.getBean(FlightRepository.class);
		Flight f = new Flight("BR-ATH-001","Athens");
		f. setFlightNumber("00001");  // Er was nog geen constructor aangemaakt
										// voor de flightNumber dus doen callen we deze
										// hier via de setFlightNumber, je kan deze ook opnemen in de constructor
		fr.save(f);

		//maak een nieuw ticket
		TicketRepository tr = ac.getBean(TicketRepository.class);  // New ticket aanmaken
		Ticket t = new Ticket(500);
		t.setPassenger(p);
		t.setFlight(f);
		tr.save(t);


		List<Passenger>printList = pr.findall();
		for (Passenger passenger : printList) {
			System.out.println(passenger.getFirstName());
		}








	}
}
