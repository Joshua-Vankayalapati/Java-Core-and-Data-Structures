package com.example.javaInterfacesAndCollections;

public class StringBufferExample {
	public static void main(String[] args) {
		// Create a StringBuffer
		StringBuffer sb = new StringBuffer("Hello");

		// Append to the StringBuffer
		sb.append(", World!");

		// Insert into the StringBuffer
		sb.insert(5, "Java ");

		// Replace a portion of the StringBuffer
		sb.replace(0, 5, "Hi");

		// Delete a portion of the StringBuffer
		sb.delete(5, 9);

		// Print the modified StringBuffer
		System.out.println(sb.toString());
	}
}
