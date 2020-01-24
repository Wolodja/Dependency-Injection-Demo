package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Service;


@Service
public class ConstructorGreetingService implements GreetingService {

    private static final String I_M_FROM_CONSTRUCTOR_GREETING_SERVICE = "I'm from ConstructorGreetingService";


    @Override
    public String sayGreeting() {
        return I_M_FROM_CONSTRUCTOR_GREETING_SERVICE;
    }
}
