package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private static final String PRIMARER_GROSSOIENST = "Primarer Grossoienst";

    @Override
    public String sayHello() {
        return PRIMARER_GROSSOIENST;
    }
}
