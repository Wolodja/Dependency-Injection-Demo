package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    private static final String SERVICE_DE_ALUDO_PRIMARO = "Service de Aludo Primaro";

    @Override
    public String sayHello() {
        return SERVICE_DE_ALUDO_PRIMARO;
    }
}
