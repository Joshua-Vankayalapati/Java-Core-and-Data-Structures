package com.example.javaInterfacesAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> integerList = new ArrayList<>();

        // Add elements to the list
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);

        // Access elements by index
        int firstElement = integerList.get(0);
        int secondElement = integerList.get(1);
        int thirdElement = integerList.get(2);

        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);
        System.out.println("Third element: " + thirdElement);

        // Iterate over the elements
        System.out.println("Iterating over elements:");
        for (int element : integerList) {
            System.out.println(element);
        }

        // Check if an element exists in the list
        int searchElement = 2;
        if (integerList.contains(searchElement)) {
            System.out.println(searchElement + " is in the list.");
        }

        // Remove an element from the list
        int removeElement = 8;
        boolean removed = integerList.remove(Integer.valueOf(removeElement));
        System.out.println("After removing " + removeElement + ": " + integerList);

        // Check if the list is empty
        boolean isEmpty = integerList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}

