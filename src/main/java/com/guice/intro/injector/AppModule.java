package com.guice.intro.injector;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.guice.intro.annotations.*;
import com.guice.intro.consumer.Consumer;
import com.guice.intro.consumer.MyApplication;
import com.guice.intro.service.EmailService;
import com.guice.intro.service.MessageService;
import com.guice.intro.service.SMSService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Consumer.class).to(MyApplication.class);
        bind(String.class).annotatedWith(EmailServiceEndpoint.class).toInstance("https://test.mailgun.com");
        bind(String.class).annotatedWith(SMSServiceEndpoint.class).toInstance("https://api.test.us1.twilio.com/");
        bind(String.class).annotatedWith(AccountId.class).toInstance("sample-id");
        bind(String.class).annotatedWith(AuthToken.class).toInstance("strong-token");
        bind(Boolean.class).annotatedWith(URLRewite.class).toInstance(false);
        bind(Boolean.class).annotatedWith(SkipVerification.class).toInstance(false);
    }

    @Provides
    @Email
    MessageService provideEmailService(
            @EmailServiceEndpoint String emailServiceEndpoint,
            @URLRewite Boolean urlRewrite,
            @SkipVerification Boolean skipVerification
            ) {
        MessageService emailService = new EmailService(emailServiceEndpoint, urlRewrite, skipVerification);
        return  emailService;
    }

    @Provides
    @SMS
    MessageService provideSMSService(
            @SMSServiceEndpoint String smsServiceEndpoint,
            @AccountId String accountId,
            @AuthToken String authToken
    ) {
        MessageService smsService = new SMSService(smsServiceEndpoint, accountId, authToken);
        return  smsService;
    }
}