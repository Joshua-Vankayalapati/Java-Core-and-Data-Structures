package com.example.javaInterfacesAndCollections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        sortedMap.put("banana", 3);
        sortedMap.put("apple", 5);
        sortedMap.put("cherry", 7);

        // Elements are automatically sorted
        System.out.println("SortedMap: " + sortedMap);
    }
}
//The SortedMap interface extends Map and maintains the elements in sorted order. 
