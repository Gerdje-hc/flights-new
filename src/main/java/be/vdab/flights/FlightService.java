package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;
}
