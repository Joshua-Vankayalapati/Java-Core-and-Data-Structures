package com.example.multithreadingExceptionHandlingAndOops;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Join both threads to the main thread
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting.");

        try {
            // Simulate some work by sleeping for a random time
            int sleepTime = (int) (Math.random() * 5000);
            Thread.sleep(sleepTime);

            System.out.println(name + " has finished after " + sleepTime + " ms.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

