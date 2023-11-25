package com.example.javaInterfacesAndCollections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();

        navigableMap.put("apple", 5);
        navigableMap.put("banana", 3);
        navigableMap.put("cherry", 7);

        // Navigation methods
        System.out.println("Floor entry for 'b': " + navigableMap.floorEntry("b"));
        System.out.println("Ceiling entry for 'c': " + navigableMap.ceilingEntry("c"));
    }
}
//The NavigableMap interface extends SortedMap and provides navigation methods.