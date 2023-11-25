package com.example.javaInterfacesAndCollections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(1);

		System.out.println("Elements in the TreeSet (sorted): " + treeSet);
	}
}
