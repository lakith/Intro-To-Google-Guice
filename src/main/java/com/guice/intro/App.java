package com.guice.intro;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.intro.consumer.Consumer;
import com.guice.intro.injector.AppModule;
import static com.guice.intro.constents.Constents.EMAIL_SERVICE;

public class App
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new AppModule());
        Consumer consumer = injector.getInstance(Consumer.class);
        consumer.processMessages("Hi Lakith", "lakithmuthugala@gmail.com", EMAIL_SERVICE);
    }
}
