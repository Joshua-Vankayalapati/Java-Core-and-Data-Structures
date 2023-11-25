package com.example.multithreadingExceptionHandlingAndOops;

public class ConcurrencyExample {
	
    public static void main(String[] args) {
        // Create a shared counter variable
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(new IncrementTask(counter));
        Thread thread2 = new Thread(new IncrementTask(counter));

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}

class Counter {
    private int value = 0;

    // Use synchronized to ensure safe access to the counter
    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

class IncrementTask implements Runnable {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

