package com.example.DSA;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Accessing elements in the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Adding an element at the beginning of the LinkedList
        names.addFirst("Eve");

        // Adding an element at the end of the LinkedList
        names.addLast("Frank");

        // Removing an element from the LinkedList
        names.remove(2); // Removes the element at index 2 (value "Charlie")

        // Updating an element in the LinkedList
        names.set(1, "Bob Smith"); // Updates the element at index 1 (value "Bob") to "Bob Smith"

        // Checking if the LinkedList contains a specific element
        String searchName = "David";
        if (names.contains(searchName)) {
            System.out.println(searchName + " is present in the LinkedList.");
        } else {
            System.out.println(searchName + " is not present in the LinkedList.");
        }

        // Getting the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the LinkedList: " + size);

        // Clearing the LinkedList (removing all elements)
        names.clear();

        // Checking if the LinkedList is empty
        if (names.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }
    }
}
