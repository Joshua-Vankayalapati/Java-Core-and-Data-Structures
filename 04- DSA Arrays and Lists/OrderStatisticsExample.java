package com.example.DSA;

import java.util.Random;

public class OrderStatisticsExample {
    public static int findKthSmallest(int[] arr, int k) {
        if (k > 0 && k <= arr.length) {
            return quickSelect(arr, 0, arr.length - 1, k - 1);
        } else {
            return -1; // Invalid input
        }
    }

    // QuickSelect algorithm to find the k-th smallest element
    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    // Helper method for partitioning
    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left + new Random().nextInt(right - left + 1);
        int pivot = arr[pivotIndex];

        // Move pivot to the rightmost position
        swap(arr, pivotIndex, right);

        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Move pivot to its final place
        swap(arr, i, right);

        return i;
    }

    // Helper method for swapping elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 9, 7, 25, 15};
        int k = 3; // Find the 3rd smallest element

        int result = findKthSmallest(arr, k);

        if (result != -1) {
            System.out.println("The " + k + "-th smallest element is: " + result);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
