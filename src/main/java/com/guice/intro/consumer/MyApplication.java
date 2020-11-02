package com.guice.intro.consumer;


import com.guice.intro.annotations.Email;
import com.guice.intro.annotations.SMS;
import com.guice.intro.service.MessageService;

import javax.inject.Inject;

public class MyApplication implements Consumer {

    private MessageService emailService;

    @Inject
    public  MyApplication (@SMS MessageService messageService) {
        this.emailService = messageService;
    }

    @Override
    public void processMessages(String message, String receiver) {
        //do some msg validation, manipulation logic etc
        this.emailService.sendMessage(message, receiver);
    }
}
