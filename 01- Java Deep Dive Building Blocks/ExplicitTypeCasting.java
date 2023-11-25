package com.example.javaBuildingBlocks;

public class ExplicitTypeCasting {

    public static void main(String[] args) {
    	
        double myDouble = 10.5;
        int myInt = (int) myDouble; // Explicitly typecasting double to int

        System.out.println("Double value: " + myDouble);
        System.out.println("Int value: " + myInt);
    }
}
