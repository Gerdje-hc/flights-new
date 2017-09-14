package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service   //  of @Component kan je ook gebruik,  @Service is specifieker
public class PassengerService {


    @Autowired
    private PassengerRepository passengerRepository;

    public List <Passenger> getAll(){
        return passengerRepository.findAll();

    }
}

