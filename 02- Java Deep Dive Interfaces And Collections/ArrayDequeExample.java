package com.example.javaInterfacesAndCollections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of strings
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue (add) elements to the queue
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("cherry");

        // Peek at the front element (without removing)
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Dequeue (remove) elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Peek at the front element again
        frontElement = queue.peek();
        System.out.println("Front element after dequeue: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}

/*
 * An ArrayDeque is a double-ended queue implementation in Java that is
 * resizable and can function as both a queue and a stack.
 */
