package com.example.javaInterfacesAndCollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue with associated priorities
        priorityQueue.offer(3); // Low priority
        priorityQueue.offer(1); // High priority
        priorityQueue.offer(2); // Medium priority

        // Process elements in order of priority
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Processing element with priority: " + element);
        }
    }
}

/*
 * A PriorityQueue is a type of queue where elements are processed in order of
 * their priority. Elements are added to the queue with an associated priority,
 * and the elements with higher priority are dequeued first.
 */