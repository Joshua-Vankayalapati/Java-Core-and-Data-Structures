package com.example.javaInterfacesAndCollections;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// Create a Stack of strings
		Stack<String> stack = new Stack<>();

		// Push elements onto the stack
		stack.push("apple");
		stack.push("banana");
		stack.push("cherry");

		// Pop elements from the stack
		System.out.println("Popped element: " + stack.pop());

		// Peek at the top element
		System.out.println("Top element: " + stack.peek());

		// Check if the stack is empty
		System.out.println("Is the stack empty? " + stack.isEmpty());
	}
}
/*
 * Stack:
 * 
 * Stack is a subclass of Vector and also implements the List interface. It
 * follows the Last-In-First-Out (LIFO) order and is used for stack-like
 * behavior.
 */