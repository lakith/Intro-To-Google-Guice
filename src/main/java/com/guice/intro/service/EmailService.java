package com.guice.intro.service;

import javax.inject.Inject;

public class EmailService implements MessageService {

    private String emailServiceEndpoint;
    private boolean urlRewrite;
    private boolean skipVerification;

    @Inject
    public EmailService(String emailServiceEndpoint, boolean urlRewrite, boolean skipVerification) {
        this.emailServiceEndpoint = emailServiceEndpoint;
        this.urlRewrite = urlRewrite;
        this.skipVerification = skipVerification;
    }

    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send email
        System.out.println("Email Sent to " + receiver + " with Message = " + message);
        System.out.println(emailServiceEndpoint);
        System.out.println(urlRewrite);
        System.out.println(skipVerification);
    }
}
