package com.guice.intro.service;

import javax.inject.Inject;

public class SMSService implements MessageService {

    private String emailServiceEndpoint;
    private String AccountId;
    private String authToken;

    @Inject
    public SMSService(String emailServiceEndpoint, String accountId, String authToken) {
        this.emailServiceEndpoint = emailServiceEndpoint;
        AccountId = accountId;
        this.authToken = authToken;
    }

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send sms
        System.out.println("SMS Sent to " + receiver + " with Message = " + message);
        System.out.println(emailServiceEndpoint);
        System.out.println(AccountId);
        System.out.println(authToken);
    }
}
