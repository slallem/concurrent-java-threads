package com.example.common;

public class FineSyncedLogger extends Thread {

    private final int id;
    private final EventLog eventLog;
    private final long maxLog;
    private final boolean synced;

    public FineSyncedLogger(int id, EventLog eventLog, long number, boolean synced) {
        this.id = id;
        this.eventLog = eventLog;
        this.maxLog = number;
        this.synced = synced;
    }

    public void run() {
        System.out.printf("--> Start thread %s%n", id);
        if (synced) {
            new EventLogger(id).runSynced(eventLog, maxLog);
        } else {
            new EventLogger(id).run(eventLog, maxLog);
        }
        System.out.printf("<-- End thread %s%n", id);
    }

}
