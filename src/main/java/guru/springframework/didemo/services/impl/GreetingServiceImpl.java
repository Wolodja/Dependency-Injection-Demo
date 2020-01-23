package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO = "Hello Guru - Original";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
