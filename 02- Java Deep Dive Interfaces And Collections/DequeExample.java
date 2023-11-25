package com.example.javaInterfacesAndCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque of strings using an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deque.addFirst("apple");
        deque.addLast("banana");
        deque.add("cherry"); // Equivalent to adding to the back

        // Access elements at the front and back
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove elements from the front and back
        String removedFirstElement = deque.removeFirst();
        String removedLastElement = deque.removeLast();

        System.out.println("Removed first element: " + removedFirstElement);
        System.out.println("Removed last element: " + removedLastElement);

        // Check if the deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the deque empty? " + isEmpty);
    }
}

/*
 * Deque (Double-Ended Queue) is a versatile data structure in Java that allows
 * you to perform insertions and removals from both ends.
 */