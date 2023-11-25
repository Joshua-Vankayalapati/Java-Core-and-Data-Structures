package com.example.javaInterfacesAndCollections;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Add elements to the Vector
        vector.add(5);
        vector.add(2);
        vector.add(8);

        // Access elements by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Iterate over the elements using Enumeration
        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("Iterating over elements:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
/*
 * Vector:
 * 
 * Vector is another class that implements the List interface. It is similar to
 * ArrayList but is synchronized, making it thread-safe.
 */