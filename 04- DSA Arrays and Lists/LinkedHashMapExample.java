package com.example.DSA;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store contact information
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();

        // Adding entries to the linked hash map
        contacts.put("Alice", "alice@example.com");
        contacts.put("Bob", "bob@example.com");
        contacts.put("Charlie", "charlie@example.com");
        contacts.put("David", "david@example.com");

        // Accessing values using keys
        String name = "Bob";
        if (contacts.containsKey(name)) {
            String email = contacts.get(name);
            System.out.println("Email for " + name + ": " + email);
        } else {
            System.out.println("No contact found for " + name);
        }

        // Iterating through the linked hash map entries
        System.out.println("Contact list:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " - Email: " + entry.getValue());
        }

        // Removing an entry from the linked hash map
        contacts.remove("Charlie");

        // Checking if the linked hash map contains a specific value
        String searchEmail = "david@example.com";
        if (contacts.containsValue(searchEmail)) {
            System.out.println("A contact has the email: " + searchEmail);
        } else {
            System.out.println("No contact has the email: " + searchEmail);
        }

        // Getting the size of the linked hash map
        int size = contacts.size();
        System.out.println("Number of contacts: " + size);

        // Checking if the linked hash map is empty
        if (contacts.isEmpty()) {
            System.out.println("The linked hash map is empty.");
        } else {
            System.out.println("The linked hash map is not empty.");
        }
    }
}
