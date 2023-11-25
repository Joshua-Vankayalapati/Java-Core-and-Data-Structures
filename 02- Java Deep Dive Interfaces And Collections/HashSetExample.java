package com.example.javaInterfacesAndCollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// Create a HashSet of integers
		Set<Integer> hashSet = new HashSet<>();

		// Add elements to the HashSet
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(8);
		hashSet.add(1);
		hashSet.add(5); // Duplicate elements are not allowed

		// Display the elements in the HashSet
		System.out.println("Elements in the HashSet: " + hashSet);

		// Check if an element exists in the HashSet
		int searchElement = 2;
		if (hashSet.contains(searchElement)) {
			System.out.println(searchElement + " is in the HashSet.");
		}

		// Remove an element from the HashSet
		int removeElement = 8;
		hashSet.remove(removeElement);
		System.out.println("After removing " + removeElement + ": " + hashSet);

		// Iterate over the elements
		System.out.println("Iterating over elements:");
		for (int element : hashSet) {
			System.out.println(element);
		}
	}
}
