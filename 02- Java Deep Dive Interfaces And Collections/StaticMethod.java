package com.example.javaInterfacesAndCollections;

public class StaticMethod {

	// Static method
	public static int add(int a, int b) {
		return a + b;
	}

	// Another static method
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		int sum = StaticMethod.add(5, 3);
		int product = StaticMethod.multiply(5, 3);

		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}

/*
 * Static Methods: Static methods belong to the class itself and not to any
 * specific instance (object) of the class. They can only access other static
 * members of the class and cannot use instance variables or instance methods
 * directly.
 */