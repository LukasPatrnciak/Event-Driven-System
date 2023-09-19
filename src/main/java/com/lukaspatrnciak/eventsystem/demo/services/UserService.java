package com.lukaspatrnciak.eventsystem.demo.services;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.event.Listener;

public interface UserService extends Listener<User> {
}
