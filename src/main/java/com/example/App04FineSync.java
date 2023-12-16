package com.example;

import com.example.common.EventLog;
import com.example.common.FineSyncedLogger;

public class App04FineSync {

    public static void main(String[] args) {

        System.out.println("=== Begin of main code");

        EventLog log1 = new EventLog(100);

        new FineSyncedLogger(1, log1, 1000000L, true).start();
        new FineSyncedLogger(2, log1, 1000000L, true).start();
        new FineSyncedLogger(3, log1, 1000000L, true).start();

        System.out.println("=== End of main code reached.");

    }

}
