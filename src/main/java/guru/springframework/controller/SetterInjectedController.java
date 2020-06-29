package guru.springframework.controller;

import guru.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingService greetingService;

    @Autowired
    public String sayHello(GreetingService greetingService){
        return greetingService.sayGreeting();
    }
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
