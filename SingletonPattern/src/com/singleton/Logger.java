package com.singleton;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class Logger {

    private PrintStream writer;
    private static Logger logr;

    private Logger() {
        LocalDateTime now = LocalDateTime.now();
        String fileName = "CharulDesignPatterns_" + now + ".txt";
        try {
            writer = new PrintStream(fileName);
            System.out.println("Log File : " + fileName + " is created!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if(logr == null) {
            logr = new Logger();
        }
        return logr;
    }

    public void writeMessage(String message) {
        writer.println(message);
    }
}
