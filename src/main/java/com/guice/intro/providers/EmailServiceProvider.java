package com.guice.intro.providers;

import com.google.inject.Provider;
import com.guice.intro.annotations.*;
import com.guice.intro.service.EmailService;
import javax.inject.Inject;

public class EmailServiceProvider implements Provider<EmailService> {

    private String emailServiceEndpoint;
    private boolean urlRewrite;
    private boolean skipVerification;

    @Inject
    public EmailServiceProvider(
            @EmailServiceEndpoint String emailServiceEndpoint,
            @URLRewite boolean urlRewrite,
            @SkipVerification boolean skipVerification) {
        this.emailServiceEndpoint = emailServiceEndpoint;
        this.urlRewrite = urlRewrite;
        this.skipVerification = skipVerification;
    }

    @Override
    public EmailService get() {
        EmailService emailService = new EmailService(emailServiceEndpoint, urlRewrite, skipVerification);
        return  emailService;
    }
}
