package com.example.common;

public class ThreadLogger extends Thread {

    private final int id;
    private final EventLog eventLog;
    private final long maxLog;

    public ThreadLogger(int id, EventLog eventLog, long number) {
        this.id = id;
        this.eventLog = eventLog;
        this.maxLog = number;
    }

    public void run() {
        System.out.printf("--> Start thread %s%n", id);
        new EventLogger(id).run(eventLog, maxLog);
        System.out.printf("<-- End thread %s%n", id);
    }

}
