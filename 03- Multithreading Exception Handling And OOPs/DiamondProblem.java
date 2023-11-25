package com.example.multithreadingExceptionHandlingAndOops;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

interface Carnivore {
	void eat();
}

interface Herbivore {
	void eat();
}

// Multiple inheritance: Both Carnivore and Herbivore have an eat() method.
class Omnivore implements Carnivore, Herbivore {
	// We have to provide an implementation for the eat() method
	// because it's inherited from both interfaces.
	public void eat() {
		System.out.println("Omnivore eats both plants and animals");
	}
}

public class DiamondProblem {
	public static void main(String[] args) {
		Omnivore omni = new Omnivore();
		omni.eat(); // Which eat() method should be called?

		// The diamond problem occurs when the method resolution is ambiguous.
	}
}
