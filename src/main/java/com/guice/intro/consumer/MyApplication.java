package com.guice.intro.consumer;

import com.guice.intro.service.MessageService;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyApplication implements Consumer {

    Map<String, MessageService> serviceNamevsService;

    @Inject
    public  MyApplication (Set<MessageService> services) {
        serviceNamevsService = new HashMap<String, MessageService>();

        for(MessageService messageService : services) {
            serviceNamevsService.put(messageService.getServiceName(), messageService);
        }

    }

    @Override
    public void processMessages(String message, String receiver, String serviceType) {
        //do some msg validation, manipulation logic etc
        MessageService emailService = serviceNamevsService.get(serviceType);
        emailService.sendMessage(message, receiver);
    }
}
