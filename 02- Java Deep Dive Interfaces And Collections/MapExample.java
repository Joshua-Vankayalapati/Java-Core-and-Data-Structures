package com.example.javaInterfacesAndCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("cherry", 7);

        // Access values by key
        int cherryCount = map.get("cherry");
        System.out.println("Cherry count: " + cherryCount);

        // Iterate over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


/*
 * The Map interface represents a collection of key-value pairs. The most
 * commonly used implementation of the Map interface is HashMap.
 */