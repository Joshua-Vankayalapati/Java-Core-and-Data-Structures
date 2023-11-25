package com.example.SortingAndSearching;

public class ExponentialSearchExample {

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        int target = 12;
	        int index = exponentialSearch(arr, target);

	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }

	    public static int exponentialSearch(int[] arr, int target) {
	        int n = arr.length;
	        if (arr[0] == target) {
	            return 0; // Element found at the first position
	        }

	        int i = 1;
	        while (i < n && arr[i] <= target) {
	            i *= 2;
	        }

	        // Perform a binary search within the range [i/2, min(i, n-1)]
	        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
	    }

	    public static int binarySearch(int[] arr, int target, int left, int right) {
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
