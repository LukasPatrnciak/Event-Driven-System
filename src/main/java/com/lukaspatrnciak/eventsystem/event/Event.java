package com.lukaspatrnciak.eventsystem.event;

/*
Genericky typ T
- predpoklad, ze v systeme mame nejake objekty
 */

public class Event<T> {
    private T source; // Data, ktore budeme chciet prostrednictvom eventu posielat dalej

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public Event(T source) {
        this.source = source;
    }
}
