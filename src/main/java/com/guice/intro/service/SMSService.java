package com.guice.intro.service;

import static com.guice.intro.constents.Constents.SMS_SERVICE;

public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send sms
        System.out.println("SMS Sent to " + receiver + " with Message = " + message);
    }

    @Override
    public String getServiceName() {
        return SMS_SERVICE;
    }
}
