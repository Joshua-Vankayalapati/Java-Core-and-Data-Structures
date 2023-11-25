package com.example.javaInterfacesAndCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// Create a LinkedHashSet of strings
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

		// Add elements to the LinkedHashSet
		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("cherry");
		linkedHashSet.add("apple"); // Duplicate elements are not allowed

		// Display the elements in the LinkedHashSet
		System.out.println("Elements in the LinkedHashSet: " + linkedHashSet);

		// Iterate over the elements in the order of insertion
		System.out.println("Iterating over elements:");

		for (String element : linkedHashSet) {
			System.out.println(element);
		}
	}
}
