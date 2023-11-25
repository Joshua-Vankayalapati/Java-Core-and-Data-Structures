package com.example.DSA;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack to store integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Popping elements from the stack
        System.out.println("Popped elements from the stack:");
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println(element);
        }

        // Pushing and peeking at elements
        stack.push(50);
        stack.push(60);
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Checking if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}

