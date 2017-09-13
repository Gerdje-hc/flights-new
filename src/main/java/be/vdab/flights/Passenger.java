package be.vdab.flights;

import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
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
    String lastname;
    int frequentFlyer;

    @OneToMany(mappedBy = "passenger")   // field niet de classe!
    private List<Ticket> ticketList = new ArrayList<>();



    public Passenger(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }



    public Passenger(String firstName, String lastname, int frequentFlyer) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.frequentFlyer = frequentFlyer;
    }

    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }


    }

