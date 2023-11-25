package com.example.javaInterfacesAndCollections;

public class MethodLocalInnerClassExample {

	
	    void someMethod() {
	        class MethodLocalInner {
	            void display() {
	                System.out.println("Inside Method Local Inner Class");
	            }
	        }
	        MethodLocalInner inner = new MethodLocalInner();
	        inner.display();
	    }
}

/*
 * Method Local Inner Classes:
 * 
 * Method local inner classes are defined within a method. They can only be
 * accessed within that method. They are useful when you need a class for a
 * specific task only within a method.
 */

