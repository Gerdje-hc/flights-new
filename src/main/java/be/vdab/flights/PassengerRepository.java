package be.vdab.flights;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {   // De subclasses voor deze interface worden automatisch geimplementeerd door spring

List<Passenger> findPassengerOrderByfirstName (String firstName);

}


