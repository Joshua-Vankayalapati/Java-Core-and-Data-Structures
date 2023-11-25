package com.example.multithreadingExceptionHandlingAndOops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		// 1. ArithmeticException
		int result = 5 / 0; // This will throw an ArithmeticException

		// 2. NullPointerException
		String text = null;
		int length = text.length(); // This will throw a NullPointerException

		// 3. ArrayIndexOutOfBoundsException
		int[] arr = { 1, 2, 3 };
		int value = arr[3]; // This will throw an ArrayIndexOutOfBoundsException

		// 4. NumberFormatException
		String str = "abc";
		int num = Integer.parseInt(str); // This will throw a NumberFormatException

		// 5. IllegalArgumentException
		int age = -5;
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}

		// 7. Custom Exception
		try {
			throw new MyCustomException("This is a custom exception.");
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program continues...");
	}
}

class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}

		// 6. IOException Exception
	public static void readFromFile(String filename) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			throw e;
		}
		try {
			readFromFile("file.txt");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
