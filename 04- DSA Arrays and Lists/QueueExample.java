package com.example.DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue to store integers
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Accessing elements in the queue (front to back)
        System.out.println("Elements in the queue:");
        for (int number : queue) {
            System.out.println(number);
        }

        // Removing and returning the front element from the queue
        int frontElement = queue.poll();
        System.out.println("Front element of the queue: " + frontElement);

        // Checking if the queue contains a specific element
        int searchElement = 30;
        if (queue.contains(searchElement)) {
            System.out.println(searchElement + " is present in the queue.");
        } else {
            System.out.println(searchElement + " is not present in the queue.");
        }

        // Getting the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Checking if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
