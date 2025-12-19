package com.springIdApplication.Depenci.Services;

import com.springIdApplication.Depenci.Interface.IWelcome;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService implements IWelcome {

    @Override
    public String welcomeMessage(){
        return "Welcome to Spring Boot";
    }
}
