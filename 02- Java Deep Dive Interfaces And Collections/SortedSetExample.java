package com.example.javaInterfacesAndCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		SortedSet<String> sortedSet = new TreeSet<>();

		sortedSet.add("banana");
		sortedSet.add("cherry");
		sortedSet.add("apple");

		System.out.println("Elements in the TreeSet (sorted): " + sortedSet);
	}
}
