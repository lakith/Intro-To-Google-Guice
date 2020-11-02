package com.guice.intro.service;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send sms
        System.out.println("SMS Sent to " + receiver + " with Message = " + message);
    }
}
