package com.example.DSA;

public class LongestIncreasingSubsequence {
    public static int findLISLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] lis = new int[n];

        // Initialize the LIS array with 1 (each element is a valid subsequence)
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }

        // Calculate the LIS for each element in the array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Find the maximum value in the LIS array
        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLIS) {
                maxLIS = lis[i];
            }
        }

        return maxLIS;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int length = findLISLength(nums);

        System.out.println("Longest Increasing Subsequence Length: " + length);
    }
}
