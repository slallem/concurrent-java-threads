package com.example.common;

import java.util.List;

public class EventLogger {

    private final int id;

    public EventLogger(int id) {
        this.id = id;
    }

    public void run(EventLog eventLog, long number) {
        System.out.printf("Start logging %s%n", id);
        for (long i = 0; i < number; i++) {
            eventLog.log("some log");
            logThings(eventLog);
        }
        System.out.printf("End logging %d%n", id);
    }

    public void runSynced(EventLog eventLog, long number) {
        System.out.printf("Start logging %s%n", id);
        for (long i = 0; i < number; i++) {
            synchronized (EventLog.class) {
                logThings(eventLog);
            }
        }
        System.out.printf("End logging %d%n", id);
    }

    public void logThings(EventLog eventLog) {
        eventLog.log("some log");
        for (int j = 0; j < eventLog.size(); j++) {
            List<String> events = eventLog.getEvents();
            events.set(j, eventLog.getEvent(j) + "x");
        }
    }

}
