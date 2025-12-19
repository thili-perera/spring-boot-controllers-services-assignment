package com.springIdApplication.Depenci.Services;

import com.springIdApplication.Depenci.Interface.IMessage;
import org.springframework.stereotype.Service;

@Service
public class EnglishMessageService implements IMessage {
    public String getMessage(){
        return "Welcome!";
    }
}
