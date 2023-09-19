package com.lukaspatrnciak.eventsystem.event;

/*
 * Listeneri, ktore ked niekto notifikuje, tak nejakym sposobom zareaguje
 */

public interface Listener<T> { // Listener na nejaky konkretny objekt (genericky typ)
    void onEvent(Event<T> event); // Pre vsetky eventy daneho typu
}
