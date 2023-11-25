package com.example.multithreadingExceptionHandlingAndOops;

import java.io.*;

class Student implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 25);

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
