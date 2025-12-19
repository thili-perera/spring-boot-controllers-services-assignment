package com.springIdApplication.Depenci.Controller;

import com.springIdApplication.Depenci.Interface.IGreeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final IGreeting _contextGreeting;

    public GreetingController(IGreeting greetingService){
        this._contextGreeting = greetingService;
    }

    @GetMapping("/greet")
    public String Greeting(@RequestParam String name){
        return this._contextGreeting.greetingMessage(name);
    }
}
