package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Injected through constructor";
    }
}
