package com.example.multithreadingExceptionHandlingAndOops;

//Encapsulation: Using private and public methods and attributes
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Public methods to access private attributes
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Abstraction: Hiding implementation details
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

//Inheritance: Creating a subclass
class Student extends Person {
	private String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age); // Call the constructor of the parent class
		this.studentId = studentId;
	}

	// Polymorphism: Overriding a method
	@Override
	public void displayInfo() {
		super.displayInfo(); // Call the parent class's method
		System.out.println("Student ID: " + studentId);
	}
}

public class PillarsOfOOPS {
	public static void main(String[] args) {
		// Create objects and demonstrate the concepts
		Person person = new Person("John", 30);
		Student student = new Student("Alice", 20, "S12345");

		// Encapsulation: Accessing attributes through methods
		System.out.println(person.getName()); // John
		System.out.println(student.getName()); // Alice

		// Abstraction: Using the displayInfo method to hide implementation details
		person.displayInfo(); // Name: John, Age: 30
		student.displayInfo(); // Name: Alice, Age: 20, Student ID: S12345
	}
}
