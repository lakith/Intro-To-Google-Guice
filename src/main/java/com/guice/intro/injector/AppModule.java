package com.guice.intro.injector;

import com.google.inject.AbstractModule;
import com.guice.intro.annotations.*;
import com.guice.intro.consumer.Consumer;
import com.guice.intro.consumer.MyApplication;
import com.google.inject.multibindings.Multibinder;
import com.guice.intro.service.EmailService;
import com.guice.intro.service.MessageService;
import com.guice.intro.service.SMSService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Consumer.class).to(MyApplication.class);

        Multibinder<MessageService> messageServiceMultibinder = Multibinder.newSetBinder(binder(), MessageService.class);
        messageServiceMultibinder.addBinding().to(EmailService.class);
        messageServiceMultibinder.addBinding().to(SMSService.class);
    }
}

