package com.example.DSA;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing an element from the ArrayList
        numbers.remove(2); // Removes the element at index 2 (value 30)

        // Updating an element in the ArrayList
        numbers.set(1, 25); // Updates the element at index 1 (value 20) to 25

        // Checking if the ArrayList contains a specific element
        int searchElement = 40;
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing the ArrayList (removing all elements)
        numbers.clear();

        // Checking if the ArrayList is empty
        if (numbers.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
