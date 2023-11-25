package com.example.javaInterfacesAndCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of strings using a LinkedList
        Queue<String> queue = new LinkedList<>();

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
