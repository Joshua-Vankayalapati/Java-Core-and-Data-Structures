package com.example.DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque to store integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        // Adding elements to the back of the deque
        deque.addLast(5);
        deque.addLast(15);

        // Accessing elements in the deque from the front
        System.out.println("Elements in the deque (from the front):");
        for (int number : deque) {
            System.out.println(number);
        }

        // Accessing elements in the deque from the back
        System.out.println("Elements in the deque (from the back):");
        while (!deque.isEmpty()) {
            int element = deque.removeLast();
            System.out.println(element);
        }
    }
}
