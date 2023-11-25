package com.example.javaInterfacesAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");

        // Access elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Iterate over the elements
        System.out.println("Iterating over elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
/*
 * ArrayList:
 * 
 * ArrayList is a class that implements the List interface. It provides a
 * dynamic array that can grow or shrink in size.
 */