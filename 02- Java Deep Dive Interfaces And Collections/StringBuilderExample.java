package com.example.javaInterfacesAndCollections;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append to the StringBuilder
        sb.append(", World!");

        // Insert into the StringBuilder
        sb.insert(5, "Java ");

        // Replace a portion of the StringBuilder
        sb.replace(0, 5, "Hi");

        // Delete a portion of the StringBuilder
        sb.delete(5, 9);

        // Print the modified StringBuilder
        System.out.println(sb.toString());
    }
}
