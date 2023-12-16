package com.example;

import com.example.common.CoarseSyncedLogger;
import com.example.common.EventLog;

public class App03CoarseSync {

    public static void main(String[] args) {

        System.out.println("=== Begin of main code");

        EventLog log1 = new EventLog(100);

        new CoarseSyncedLogger(1, log1, 1000000L, false).start();
        new CoarseSyncedLogger(2, log1, 1000000L, false).start();
        new CoarseSyncedLogger(3, log1, 1000000L, false).start();

        System.out.println("=== End of main code reached.");

    }

}
