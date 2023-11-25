package com.example.javaInterfacesAndCollections;

public class InstanceMethod {

    // Instance variable
    private int value;

    // Instance method
    public void setValue(int newValue) {
        this.value = newValue;
    }

    // Another instance method
    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
    	InstanceMethod myObject = new InstanceMethod();  //object reference
        myObject.setValue(42); //invoking by using myObject.methodName()
        System.out.println("Value: " + myObject.getValue());
    }
}

/*
 * Instance Methods: Instance methods are associated with an instance of the
 * class (an object). They can access instance variables and other instance
 * methods. To call an instance method, you need to create an object of the
 * class and use the dot notation.
 */
