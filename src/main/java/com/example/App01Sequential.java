package com.example;

import com.example.common.EventLog;
import com.example.common.EventLogger;

public class App01Sequential {

    public static void main(String[] args) {

        System.out.println("=== Begin of main code");

        EventLog log1 = new EventLog(100);

        new EventLogger(1).run(log1, 1000000L);
        new EventLogger(2).run(log1, 1000000L);
        new EventLogger(3).run(log1, 1000000L);

        System.out.println("=== End of main code reached.");

    }

}
