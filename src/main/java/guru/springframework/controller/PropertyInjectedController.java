package guru.springframework.controller;

import guru.springframework.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return getGreetingService().sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
