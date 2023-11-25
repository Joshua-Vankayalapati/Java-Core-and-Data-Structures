package com.example.multithreadingExceptionHandlingAndOops;

import java.util.concurrent.Semaphore;

class SharedResource {
    private Semaphore semaphore = new Semaphore(1);

    public void accessResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            resource.accessResource();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
