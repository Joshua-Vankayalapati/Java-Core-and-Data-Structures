package com.example.SortingAndSearching;

public class MergeSortExample {

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            // Find the middle point of the array
	            int mid = left + (right - left) / 2;

	            // Recursively sort the first and second halves
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            // Merge the sorted halves
	            merge(arr, left, mid, right);
	        }
	    }

	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        // Create temporary arrays to hold the two halves
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Copy data to temporary arrays leftArray[] and rightArray[]
	        for (int i = 0; i < n1; i++) {
	            leftArray[i] = arr[left + i];
	        }
	        for (int i = 0; i < n2; i++) {
	            rightArray[i] = arr[mid + 1 + i];
	        }

	        // Merge the temporary arrays back into arr[left..right]
	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArray[], if any
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArray[], if any
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	}
