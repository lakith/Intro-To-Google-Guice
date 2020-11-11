package com.guice.intro.service;

import javax.inject.Inject;

public class SMSService implements MessageService {

    private String smsServiceEndpoint;
    private String AccountId;
    private String authToken;

    @Inject
    public SMSService(String emailServiceEndpoint, String accountId, String authToken) {
        this.smsServiceEndpoint = emailServiceEndpoint;
        AccountId = accountId;
        this.authToken = authToken;
    }

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send sms
        System.out.println("SMS Sent to " + receiver + " with Message = " + message);
        System.out.println(smsServiceEndpoint);
        System.out.println(AccountId);
        System.out.println(authToken);
    }
}
