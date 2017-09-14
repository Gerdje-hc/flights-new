package be.vdab.flights;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity
public class Ticket {
    public Ticket() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)

    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket(double price) {
        this.price = price;
    }



    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }



    public Passenger getPassenger() {
        return passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        passenger.addTicket(this);
    }

    @ManyToOne
    private Flight flight;

    @ManyToOne
    private Passenger passenger;




}
