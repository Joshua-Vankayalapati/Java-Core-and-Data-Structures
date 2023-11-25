package com.example.DSA;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store integers
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        // Adding a duplicate element (will be ignored)
        numbers.add(10);

        // Accessing elements in the LinkedHashSet (order of insertion is maintained)
        System.out.println("Elements in the LinkedHashSet:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing an element from the LinkedHashSet
        numbers.remove(3);

        // Checking if the LinkedHashSet contains a specific element
        int searchNumber = 8;
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the LinkedHashSet.");
        } else {
            System.out.println(searchNumber + " is not present in the LinkedHashSet.");
        }

        // Getting the size of the LinkedHashSet
        int size = numbers.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // Clearing the LinkedHashSet (removing all elements)
        numbers.clear();

        // Checking if the LinkedHashSet is empty
        if (numbers.isEmpty()) {
            System.out.println("The LinkedHashSet is empty.");
        } else {
            System.out.println("The LinkedHashSet is not empty.");
        }

        // Adding elements using a loop
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using an Iterator to access elements
        System.out.println("Elements in the names LinkedHashSet:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
