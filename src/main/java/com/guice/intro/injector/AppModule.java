package com.guice.intro.injector;


import com.google.inject.AbstractModule;
import com.guice.intro.annotations.Email;
import com.guice.intro.annotations.SMS;
import com.guice.intro.consumer.Consumer;
import com.guice.intro.consumer.MyApplication;
import com.guice.intro.service.EmailService;
import com.guice.intro.service.MessageService;
import com.guice.intro.service.SMSService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Consumer.class).to(MyApplication.class);
        bind(MessageService.class).annotatedWith(Email.class).to(EmailService.class);
        bind(MessageService.class).annotatedWith(SMS.class).to(SMSService.class);
    }
}