package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    private static final String I_AM_FROM_SETTER_GREETING_SERVICE = "I am from SetterGreetingService";

    @Override
    public String sayGreeting() {
        return I_AM_FROM_SETTER_GREETING_SERVICE;
    }
}
