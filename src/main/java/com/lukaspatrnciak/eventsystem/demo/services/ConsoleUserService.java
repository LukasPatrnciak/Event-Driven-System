package com.lukaspatrnciak.eventsystem.demo.services;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.event.Event;

public class ConsoleUserService implements UserService {
    public void onEvent(Event<User> event) {
        System.out.println("User event: " + event.getSource());
    }
}
