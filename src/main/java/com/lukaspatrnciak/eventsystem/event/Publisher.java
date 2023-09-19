package com.lukaspatrnciak.eventsystem.event;

/*
 * Publisher, ktory ma zoznam listenerov, ktorych notifikuje
 */

public interface Publisher<T> {
    void addListener(Listener<T> listener);
}
