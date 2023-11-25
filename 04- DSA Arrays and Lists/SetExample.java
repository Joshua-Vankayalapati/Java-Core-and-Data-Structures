package com.example.DSA;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Adding a duplicate element (will be ignored)
        numbers.add(20);

        // Accessing elements in the set (order may vary)
        System.out.println("Elements in the set:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing an element from the set
        numbers.remove(30);

        // Checking if the set contains a specific element
        int searchNumber = 40;
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the set.");
        } else {
            System.out.println(searchNumber + " is not present in the set.");
        }

        // Getting the size of the set
        int size = numbers.size();
        System.out.println("Size of the set: " + size);

        // Clearing the set (removing all elements)
        numbers.clear();

        // Checking if the set is empty
        if (numbers.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("The set is not empty.");
        }
    }
}
