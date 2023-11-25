package com.example.javaInterfacesAndCollections;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 5);
        treeMap.put("banana", 3);
        treeMap.put("cherry", 7);

        System.out.println("TreeMap: " + treeMap);
    }
}
//TreeMap is a class that implements the NavigableMap interface and is based on a Red-Black tree data structure.