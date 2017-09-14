package be.vdab.flights;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {   // -> de Integer is de primery ke van Ticket

   List<Ticket> findByPrice (double price); // dit wordt opgeroepen


}