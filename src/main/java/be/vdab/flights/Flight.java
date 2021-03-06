package be.vdab.flights;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */


@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Flight() {
    }

    @Column(unique = true, nullable = false )
    private String flightNumber; //uniek

    @Column (nullable = false)
    private String departure;
    @Column (nullable = false)
    private String destination;


    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public Flight(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }


    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    // de ToString zal alle querys automatisch afprinten in een String. Kan je genereren zoals een constructor en getters en setters
    @Override

    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
