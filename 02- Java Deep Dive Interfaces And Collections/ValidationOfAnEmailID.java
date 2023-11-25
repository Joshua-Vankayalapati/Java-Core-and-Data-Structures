package com.example.javaInterfacesAndCollections;

import java.util.Scanner;

public class ValidationOfAnEmailID {

    public static void main(String[] args) {
        // Define an array of email IDs
        String[] emailIds = {
            "employee1@example.com",
            "employee2@example.com",
            "employee3@example.com",
            "employee4@example.com",
            "employee5@example.com"
        };

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the email ID to search
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Initialize a flag to check if the email ID was found
        boolean found = false;

        // Iterate through the email IDs in the array
        for (String email : emailIds) {
            if (email.equals(searchEmail)) {
                found = true;
                break;
            }
        }

        // Check if the email ID was found and print the result
        if (found) {
            System.out.println("The email ID " + searchEmail + " was found in the array.");
        } else {
            System.out.println("The email ID " + searchEmail + " was not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
