package com.example.SortingAndSearching;

public class BinearSearchExample {

	    public static void main(String[] args) {
	        int[] arr = {5, 10, 15, 20, 25, 30};
	        int target = 20;
	        int index = binarySearch(arr, target);

	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }

	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid; // Element found, return its index
	            }

	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1; // Element not found
	    }
	}
