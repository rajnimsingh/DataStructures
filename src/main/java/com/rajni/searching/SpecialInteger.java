package com.rajni.searching;

public class SpecialInteger {
    public static void main(String[] args) {
        SpecialInteger var = new SpecialInteger();
        System.out.println(var.solve(
                new int[] {1,2,3,4,5}, 10
        ));
    }

    public int solve(int[] A, int B) {
        int left = 0;
        int right = A.length; // Upper bound for max size is the length of the array

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (maxSubArraySumForGivenSize(A, mid) > B) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public static long maxSubArraySumForGivenSize(int[] arr, int size) {
        if (size == 0) return 0;

        int n = arr.length;
        long maxSum = 0;
        long currentSum = 0;

        // Calculate the sum of the first size elements
        for (int i = 0; i < size; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        // Use sliding window to calculate sum of all subarrays of length size
        for (int i = size; i < n; i++) {
            currentSum += arr[i] - arr[i - size];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public int solveOld(int[] A, int B) {
        int l = 0;
        int r = A.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // sliding window will be applied to check the sum;
            if (calculateSum(A, mid) > B) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }

    public int calculateSum(int[] A, int K) {
        int sum = 0;
        for (int i = 0 ; i < K; i++) {
            sum += A[i];
        }

        int maxSum = sum;

        for (int i = K; i < A.length; i++) {
            sum += A[i] - A[i - K];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
