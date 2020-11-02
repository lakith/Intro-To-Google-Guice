package com.guice.intro.injector;

import com.google.inject.AbstractModule;
import com.guice.intro.consumer.Consumer;
import com.guice.intro.consumer.MyApplication;
import com.guice.intro.service.EmailService;
import com.guice.intro.service.MessageService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Consumer.class).to(MyApplication.class);
        bind(MessageService.class).to(EmailService.class);
    }
}