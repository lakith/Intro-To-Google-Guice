package com.guice.intro.consumer;

public interface Consumer {
    void processMessages(String message, String receiver, String serviceType);
}
