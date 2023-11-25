package com.example.javaInterfacesAndCollections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// Create a LinkedList of integers
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Add elements to the front and back of the list
		linkedList.addFirst(1);
		linkedList.addLast(3);
		linkedList.add(2);

		// Iterate over the elements
		System.out.println("Iterating over elements:");
		for (int element : linkedList) {
			System.out.println(element);
		}
	}
}

/*
 * LinkedList:
 * 
 * LinkedList is yet another class that implements the List interface. It is a
 * doubly-linked list, which allows elements to be efficiently added and removed
 * from both ends.
 */