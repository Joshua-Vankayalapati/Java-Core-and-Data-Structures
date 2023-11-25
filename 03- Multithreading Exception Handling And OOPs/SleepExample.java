package com.example.multithreadingExceptionHandlingAndOops;

public class SleepExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
