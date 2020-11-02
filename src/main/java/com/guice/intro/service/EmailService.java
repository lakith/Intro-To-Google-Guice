package com.guice.intro.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send email
        System.out.println("Email Sent to " + receiver + " with Message = " + message);
    }
}
