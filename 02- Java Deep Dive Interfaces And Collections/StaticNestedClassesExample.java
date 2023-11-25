package com.example.javaInterfacesAndCollections;

public class StaticNestedClassesExample {

	    static class StaticNested {
	        void display() {
	            System.out.println("Inside Static Nested Class");
	        }
	    }
}
/*
 * Static Nested Classes:
 * 
 * A static nested class is a static class defined inside another class. It
 * doesn't have access to the outer class's non-static members. It is used when
 * you want to group classes and don't need to access the outer class's
 * instance.
 */