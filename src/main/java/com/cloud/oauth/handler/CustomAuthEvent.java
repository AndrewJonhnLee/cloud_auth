package com.cloud.oauth.handler;

import com.cloud.oauth.model.XkMerchant;
import org.springframework.context.ApplicationEvent;

public class CustomAuthEvent extends ApplicationEvent {

    private XkMerchant user;
    /**
     * Create a new ApplicationEvent.
     *
     * @param user the object on which the event initially occurred (never {@code null})
     */
    public CustomAuthEvent(XkMerchant user) {
        super(user);
        this.user=user;
    }

    public XkMerchant getUser() {
        return user;
    }

    public void setUser(XkMerchant user) {
        this.user = user;
    }
}
