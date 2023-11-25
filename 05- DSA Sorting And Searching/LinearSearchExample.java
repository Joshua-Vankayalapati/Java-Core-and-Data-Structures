package com.example.SortingAndSearching;

public class LinearSearchExample {

	    public static void main(String[] args) {
	        int[] arr = {5, 10, 15, 20, 25, 30};
	        int target = 20;
	        int index = linearSearch(arr, target);

	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }

	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i; // Element found, return its index
	            }
	        }
	        return -1; // Element not found
	    }
	}
