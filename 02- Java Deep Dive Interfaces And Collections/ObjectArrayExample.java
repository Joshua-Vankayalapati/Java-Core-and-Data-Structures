package com.example.javaInterfacesAndCollections;

public class ObjectArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of objects (Strings in this case)
        Object[] items = {"Apple", "Banana", "Cherry", 42, 3.14};

        // Access and print elements of the array
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
