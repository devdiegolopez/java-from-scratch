package com.concurrency.section1;

import static com.concurrency.section1.Task.ioIntensive;

public class InboundOutboundTaskDemo {
    private static final int MAX_PLATFORM = 500000;
    static void main(String[] args) {
        platformThreadDemo2();
    }
    private static void greetMain(){
        for (int i = 0; i < MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = new Thread(() -> Task.ioIntensive(j));
            thread.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private static void platformThreadDemo(){
        for (int i = 0 ; i < MAX_PLATFORM;i++){
            int j = i;
            Thread thread = new Thread(() -> Task.ioIntensive(j));
            thread.start();
        }
    }
    private static void platformThreadDemo2(){
        for (int i = 0 ; i < MAX_PLATFORM;i++){
            int j = i;
            Thread.startVirtualThread(() -> Task.ioIntensive(j));
        }
    }
    private static void platformThreadDemo3(){
        for (int i = 0 ; i < MAX_PLATFORM;i++){
            int j = i;
            var builder = Thread.ofPlatform().daemon().name("daemin",1);
            Thread thread1 = builder.unstarted(() -> Task.ioIntensive(j));
            thread1.start();
        }
    }
}