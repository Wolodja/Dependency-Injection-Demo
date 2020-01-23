package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    private static final String HELLO_FROM_PRIMARY_GREETING_SERVICE = "Hello from PrimaryGreetingService";

    @Override
    public String sayHello() {
        return HELLO_FROM_PRIMARY_GREETING_SERVICE;
    }
}
