package com.guice.intro.service;

import static com.guice.intro.constents.Constents.EMAIL_SERVICE;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send email
        System.out.println("\n");
        System.out.println("Email Sent to " + receiver + "\nMessage = " + message);
    }

    @Override
    public String getServiceName() {
        return EMAIL_SERVICE;
    }
}
