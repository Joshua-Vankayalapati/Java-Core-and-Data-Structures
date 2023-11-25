package com.example.multithreadingExceptionHandlingAndOops;

//Approach 1: Extending the Thread Class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}


/*
 * //Approach 2: Implementing the Runnable Interface
 * 
 * public class MyRunnable implements Runnable {
 * 
 * @Override public void run() { for (int i = 1; i <= 5; i++) {
 * System.out.println(Thread.currentThread().getId() + " Value " + i); } } }
 * 
 * public class ThreadCreationExample {
 * 
 * public static void main(String[] args) { MyRunnable myRunnable = new
 * MyRunnable();
 * 
 * Thread thread1 = new Thread(myRunnable); Thread thread2 = new
 * Thread(myRunnable);
 * 
 * thread1.start(); // Start thread 1 thread2.start(); // Start thread 2
 * 
 * } }
 */