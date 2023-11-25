package com.example.javaInterfacesAndCollections;

public class NestedInnerClassExample {
	    private int outerVar = 10;

	    class Inner {
	        void display() {
	            System.out.println("Value of outerVar: " + outerVar);
	        }
	    }
	}

	/*
	 * Nested Inner Class:
	 * 
	 * A nested inner class is a non-static class defined inside another class. It
	 * has access to the members (fields and methods) of the outer class. It is
	 * typically used when the inner class logically belongs to the outer class, and
	 * it needs access to the outer class's members.
	 * 
	 */