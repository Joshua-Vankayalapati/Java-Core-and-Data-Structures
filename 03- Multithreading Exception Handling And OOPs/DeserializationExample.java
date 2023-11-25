package com.example.multithreadingExceptionHandlingAndOops;

import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        Student student = null;

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            student = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (student != null) {
            System.out.println("Deserialized Student: " + student.name + ", " + student.age);
        }
    }
}
