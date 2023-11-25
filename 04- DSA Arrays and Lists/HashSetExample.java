package com.example.DSA;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store strings
        HashSet<String> names = new HashSet<>();

        // Adding elements to the HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Adding a duplicate element (will be ignored)
        names.add("Bob");

        // Accessing elements in the HashSet (order may vary)
        System.out.println("Elements in the HashSet:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing an element from the HashSet
        names.remove("Charlie");

        // Checking if the HashSet contains a specific element
        String searchName = "David";
        if (names.contains(searchName)) {
            System.out.println(searchName + " is present in the HashSet.");
        } else {
            System.out.println(searchName + " is not present in the HashSet.");
        }

        // Getting the size of the HashSet
        int size = names.size();
        System.out.println("Size of the HashSet: " + size);

        // Clearing the HashSet (removing all elements)
        names.clear();

        // Checking if the HashSet is empty
        if (names.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }

        // Adding elements using an Iterator
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // Using an Iterator to access elements
        System.out.println("Elements in the numbers HashSet:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
