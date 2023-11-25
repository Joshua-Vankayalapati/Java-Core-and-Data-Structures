package com.example.SortingAndSearching;

public class SelectionSortExample {

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        selectionSort(arr);

	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            // Find the index of the minimum element in the unsorted portion
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the minimum element with the first element in the unsorted portion
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}
