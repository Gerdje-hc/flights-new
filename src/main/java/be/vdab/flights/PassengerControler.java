package be.vdab.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Component
public class PassengerControler {
    @Autowired       // deze gaat automatisch onderliggend alle beans maken die passengerService deze nodig heeft
    private PassengerService ps;
}
