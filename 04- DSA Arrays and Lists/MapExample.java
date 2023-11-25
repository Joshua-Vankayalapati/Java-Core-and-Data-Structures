package com.example.DSA;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map to store student names and their corresponding grades
        Map<String, Integer> studentGrades = new HashMap<>();

        // Adding entries to the map
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 91);

        // Accessing values using keys
        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            int grade = studentGrades.get(studentName);
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println(studentName + " is not found.");
        }

        // Iterating through the map entries
        System.out.println("Student names and their grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing an entry from the map
        studentGrades.remove("Charlie");

        // Checking if the map contains a specific value
        int searchGrade = 91;
        if (studentGrades.containsValue(searchGrade)) {
            System.out.println("A student has a grade of " + searchGrade);
        } else {
            System.out.println("No student has a grade of " + searchGrade);
        }

        // Getting the size of the map
        int size = studentGrades.size();
        System.out.println("Number of students: " + size);

        // Clearing the map (removing all entries)
        studentGrades.clear();

        // Checking if the map is empty
        if (studentGrades.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}
