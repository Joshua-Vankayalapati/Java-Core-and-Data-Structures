package com.example.multithreadingExceptionHandlingAndOops;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	private int count = 0;
	private Lock lock = new ReentrantLock();

	public void increment() {
		lock.lock();
		try {
			count++;
		} finally {
			lock.unlock();
		}
	}

	public int getCount() {
		return count;
	}
}

public class ReentrantLockExample {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count: " + counter.getCount());
	}
}
