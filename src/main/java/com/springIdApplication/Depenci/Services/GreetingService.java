package com.springIdApplication.Depenci.Services;

import com.springIdApplication.Depenci.Interface.IGreeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreeting {
    public String greetingMessage(String name){
        return "Hello " + name + ", welcome!";
    }
}
