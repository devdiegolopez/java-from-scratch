package com.concurrency.section1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task {

    private static final Logger log = LoggerFactory.getLogger(Task.class);
    public static void ioIntensive(int i){
        try {
            log.info("ill sleep {} seconds",i/1000);
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("i slept {} seconds",i/1000);
    }
    public static void greetings(int n){
        log.info("from greeting {}",n);
    }
}