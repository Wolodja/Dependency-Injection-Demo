package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;


public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
