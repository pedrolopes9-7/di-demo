package guru.springframework.service;

public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_WORLD = "Hello world";
    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
