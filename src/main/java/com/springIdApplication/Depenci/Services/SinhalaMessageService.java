package com.springIdApplication.Depenci.Services;

import com.springIdApplication.Depenci.Interface.IMessage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SinhalaMessageService implements IMessage {
    public String getMessage(){
        return "ආයුබෝවන්!";
    }
}
