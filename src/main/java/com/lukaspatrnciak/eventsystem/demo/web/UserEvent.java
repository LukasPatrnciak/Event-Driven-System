package com.lukaspatrnciak.eventsystem.demo.web;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.event.Event;

public class UserEvent extends Event<User> {

    public UserEvent(User source) {
        super(source);
    }
}
