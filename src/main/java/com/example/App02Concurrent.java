package com.example;

import com.example.common.EventLog;
import com.example.common.ThreadLogger;

public class App02Concurrent {
    public static void main(String[] args) {

        // This one fails because of access concurrency
        // (list is emptied while still accessed by other threads)

        System.out.println("=== Begin of main code");

        EventLog log1 = new EventLog(100);

        new ThreadLogger(1, log1, 1000000L).start();
        new ThreadLogger(2, log1, 1000000L).start();
        new ThreadLogger(3, log1, 1000000L).start();

        System.out.println("=== End of main code reached.");

    }

}
