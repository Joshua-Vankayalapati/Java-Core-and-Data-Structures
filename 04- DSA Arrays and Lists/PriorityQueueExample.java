package com.example.DSA;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue to store integers (min-heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(40);

        // Accessing elements in the priority queue (order depends on the priority)
        System.out.println("Elements in the priority queue:");
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println(element);
        }

        // Create a PriorityQueue to store integers (max-heap using a custom comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Adding elements to the max-heap
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(40);

        // Accessing elements in the max-heap (order depends on the priority)
        System.out.println("Elements in the max-heap:");
        while (!maxHeap.isEmpty()) {
            int element = maxHeap.poll();
            System.out.println(element);
        }
    }
}
