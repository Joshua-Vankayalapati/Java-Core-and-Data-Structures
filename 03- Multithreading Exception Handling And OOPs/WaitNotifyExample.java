package com.example.multithreadingExceptionHandlingAndOops;

class MyResource {
    synchronized void waitForSignal() {
        System.out.println("Waiting for signal...");
        try {
            wait(); // Release the lock and wait for a signal
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received signal!");
    }

    synchronized void sendSignal() {
        System.out.println("Sending signal...");
        notify(); // Notify a waiting thread to resume
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        MyResource resource = new MyResource();

        Thread waitingThread = new Thread(() -> {
            resource.waitForSignal();
        });

        Thread notifyingThread = new Thread(() -> {
            resource.sendSignal();
        });

        waitingThread.start();
        notifyingThread.start();
    }
}
