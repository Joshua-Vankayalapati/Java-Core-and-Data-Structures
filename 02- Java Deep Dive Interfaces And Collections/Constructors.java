package com.example.javaInterfacesAndCollections;

public class Constructors {

	private String name;
	private int age;
	private String address;

	// Default constructor (no parameters)
	public Constructors() {
		this.name = "Unknown";
		this.age = 0;
	}

	// Constructor with parameters
	public Constructors(String name, int age) {
		this.name = name;
		this.age = age;
	}

//    
//    // Private constructor prevents instantiation from outside the class
//    private Constructors() {
//        // Constructor code here
//    }

	// Copy constructor
	public Constructors(Constructors obj) {
		this.name = obj.name;
		this.age = obj.age;
		this.address = obj.address;
	}

	// Constructor chaining using 'this()'
	public Constructors(String name, int age, String address) {
		this(name, age); // Calls the parameterized constructor above
		this.address = address;
	}

	public static void main(String[] args) {
		Constructors person1 = new Constructors("Alice", 25);
		Constructors person2 = new Constructors(); // Uses the default constructor

		System.out.println(person1.name + " is " + person1.age + " years old.");
		System.out.println(person2.name + " is " + person2.age + " years old.");
	}
}

/*
 * Constructors: Constructors are special methods used to initialize objects
 * when they are created. They have the same name as the class and do not have
 * an explicit return type. Constructors are automatically called when you
 * create a new object using the new keyword.
 * 
 * Default Constructor: A default constructor is a constructor that takes no
 * parameters. If you don't provide any constructors in your class, Java
 * automatically adds a default constructor with no arguments.
 * 
 * Parameterized Constructor: A parameterized constructor is a constructor that
 * takes one or more parameters. It allows you to initialize the object's
 * instance variables with specific values provided during object creation.
 * 
 * Constructor Chaining: In Java, constructors can call other constructors using
 * the "this()" keyword. This is known as constructor chaining, and it allows
 * you to reuse code between different constructors.
 * 
 * Private Constructor: A private constructor is used to prevent the
 * instantiation of a class from outside the class itself. This is often used in
 * classes that contain only static methods and cannot be instantiated.
 * 
 * Copy Constructor: A copy constructor is a constructor that creates a new
 * object by copying the values from an existing object of the same class. It is
 * useful when you want to create a duplicate (copy) of an object.
 */
