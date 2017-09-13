package be.vdab.flights;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity       // OPGELET een Entity moet altijd een ID hebben
public class Passenger {


    @Id         // OPGELET een Entity moet altijd een ID hebben
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    int frequentFlyer;

    @OneToMany(mappedBy = "passenger")   // field niet de classe!
    private List<Ticket> ticketList = new ArrayList<>();

    /**
     * Used by JPA.
     */
    Passenger() {
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }



    public Passenger(String firstName, String lastName, int frequentFlyer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyer = frequentFlyer;
    }

    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }


    }

