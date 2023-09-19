package com.lukaspatrnciak.eventsystem.demo.services;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.event.Event;
import lombok.extern.slf4j.Slf4j; // Kniznica sluziaca na logovanie

@Slf4j
public class Slf4jUserService implements UserService {
    public void onEvent(Event<User> event) {
        log.info("User event: " + event.getSource());
    }
}
