package com.guice.intro.consumer;

import com.google.inject.Inject;
import com.guice.intro.service.MessageService;

public class MyApplication implements Consumer {

    private MessageService messageService;

    @Inject
    public  MyApplication (MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String message, String receiver) {
        //do some msg validation, manipulation logic etc
        this.messageService.sendMessage(message, receiver);
    }
}
