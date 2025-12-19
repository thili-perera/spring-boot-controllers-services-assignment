package com.springIdApplication.Depenci.Controller;

import com.springIdApplication.Depenci.Interface.IMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final IMessage _contextMessage;

    public MessageController(IMessage messageService){
        this._contextMessage = messageService;
    }

    @GetMapping("/message")
    public String PrimaryMessage(){
        return this._contextMessage.getMessage();
    }
}
