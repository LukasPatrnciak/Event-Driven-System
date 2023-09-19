package com.lukaspatrnciak.eventsystem.demo.web;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.event.Listener;
import com.lukaspatrnciak.eventsystem.event.Publisher;

import java.util.HashSet;
import java.util.Set;

public class UserInterface implements Publisher<User> {
    private Set<Listener<User>> listeners; // Mnozina listenerov

    public UserInterface() {
        listeners = new HashSet<Listener<User>>();
    }

    public void userInput(User user) {
        UserEvent event = new UserEvent(user);

        for(Listener<User> listener: listeners) {
            listener.onEvent(event);
        }
    }

    public void addListener(Listener<User>listener) {
        listeners.add(listener);
    }
}
