package com.guice.intro.providers;

import com.google.inject.Provider;
import com.guice.intro.annotations.*;
import com.guice.intro.service.SMSService;

import javax.inject.Inject;

public class SMSServiceProvider implements Provider<SMSService> {

    private String smsServiceEndpoint;
    private String accountId;
    private String authToken;

    @Inject
    public SMSServiceProvider(
            @SMSServiceEndpoint String smsServiceEndpoint,
            @AccountId String accountId,
            @AuthToken String authToken) {
        this.smsServiceEndpoint = smsServiceEndpoint;
        this.accountId = accountId;
        this.authToken = authToken;
    }

    @Override
    public SMSService get() {
        SMSService smsService = new SMSService(smsServiceEndpoint, accountId, authToken);
        return smsService;
    }
}
