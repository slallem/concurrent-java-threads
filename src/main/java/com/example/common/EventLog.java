package com.example.common;

import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private final List<String> events;
    private final int maxSize;

    public EventLog(int maxSize) {
        this.events = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public List<String> getEvents() {
        return events;
    }

    public String getEvent(int i) {
        return events.get(i);
    }

    public int size() {
        return events.size();
    }

    public void log(String event) {
        events.add(event);
        while (events.size() > maxSize) {
            events.removeFirst();
        }
    }

}
