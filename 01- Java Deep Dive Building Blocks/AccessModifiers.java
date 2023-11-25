package com.example.javaBuildingBlocks;

//A class with public access modifier
public class AccessModifiers {

	// Variables with different access modifiers
	public int publicVar = 10;
	protected int protectedVar = 20;
	int defaultVar = 30; // This is package-private (default) if no access modifier is specified
	private int privateVar = 40;

	// Methods with different access modifiers
	public void publicMethod() {
		System.out.println("This is a public method.");
	}

	protected void protectedMethod() {
		System.out.println("This is a protected method.");
	}

	void defaultMethod() {
		System.out.println("This is a default method (package-private).");
	}

	private void privateMethod() {
		System.out.println("This is a private method.");
	}

	// Main method to test the access modifiers
	public static void main(String[] args) {
		AccessModifiers myClass = new AccessModifiers();

		// Accessing variables and methods from the same class
		System.out.println("publicVar: " + myClass.publicVar);
		System.out.println("protectedVar: " + myClass.protectedVar);
		System.out.println("defaultVar: " + myClass.defaultVar);
		System.out.println("privateVar: " + myClass.privateVar);

		myClass.publicMethod();
		myClass.protectedMethod();
		myClass.defaultMethod();
		myClass.privateMethod();
	}
}
/*
public: The public access modifier allows the class, method, or variable to be accessible from anywhere, i.e., 
from any class in any package.

protected: The protected access modifier allows access to the class, method, or variable from the same class, 
any subclass (inheritance), and any class within the same package.

default (package-private): When no access modifier is specified, it is considered as default or package-private.
This means the class, method, or variable is accessible only within the same package.

private: The private access modifier restricts access to the class, method, or variable to the same class only. 
It is not accessible from any other class, even within the same package.
*/

