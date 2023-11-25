package com.example.javaInterfacesAndCollections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("apple"); // Duplicate elements are not allowed

		System.out.println("Elements in the HashSet: " + set);
	}
}
