package com.example.javaInterfacesAndCollections;

import java.util.ArrayList;

public class DynamicArrayExample {

	public static void main(String[] args) {
		// Create an ArrayList of strings
		ArrayList<String> names = new ArrayList<>();

		// Add elements to the ArrayList
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Access and print elements from the ArrayList
		for (String name : names) {
			System.out.println(name);
		}
	}
}
