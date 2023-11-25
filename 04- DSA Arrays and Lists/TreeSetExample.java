package com.example.DSA;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        // Adding a duplicate element (will be ignored)
        numbers.add(10);

        // Accessing elements in the TreeSet (elements are in sorted order)
        System.out.println("Elements in the TreeSet:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing an element from the TreeSet
        numbers.remove(3);

        // Checking if the TreeSet contains a specific element
        int searchNumber = 8;
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the TreeSet.");
        } else {
            System.out.println(searchNumber + " is not present in the TreeSet.");
        }

        // Getting the size of the TreeSet
        int size = numbers.size();
        System.out.println("Size of the TreeSet: " + size);

        // Clearing the TreeSet (removing all elements)
        numbers.clear();

        // Checking if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("The TreeSet is empty.");
        } else {
            System.out.println("The TreeSet is not empty.");
        }

        // Adding elements using a loop
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using an Iterator to access elements
        System.out.println("Elements in the names TreeSet:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
