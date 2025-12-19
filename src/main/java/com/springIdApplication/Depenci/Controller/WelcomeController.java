package com.springIdApplication.Depenci.Controller;

import com.springIdApplication.Depenci.Interface.IWelcome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final IWelcome _contextWelcome;

    public WelcomeController(IWelcome welcomeService){
        this._contextWelcome = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return this._contextWelcome.welcomeMessage();
    }

}
