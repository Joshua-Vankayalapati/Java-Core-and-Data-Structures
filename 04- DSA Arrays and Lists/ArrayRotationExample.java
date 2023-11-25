package com.example.DSA;

public class ArrayRotationExample {

    public static void rotateArray(int[] arr, int n, int k) {
        int[] temp = new int[n];

        // Copy the last k elements to the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift the remaining elements to the right
        for (int i = 0; i < n - k; i++) {
            temp[i + k] = arr[i];
        }

        // Copy the rotated elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // Number of positions to rotate

        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        rotateArray(arr, n, k);

        System.out.println("\nArray after rotating " + k + " positions to the right: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
