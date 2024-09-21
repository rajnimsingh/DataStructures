package com.rajni.arrays.slidingWindow;

/**
 * Given an array A of length N. Also given are integers B and C.
 *
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 */
public class SubArraySum {
    public static void main(String[] args) {
        System.out.println(subArrayExists(new int[] {4, 3, 2, 6, 1}, 3, 11));
    }
    public static int subArrayExists(int[] A, int B, int C) {
        int initialSum = 0;
        for (int i = 0; i < B; i++) {
            initialSum += A[i];
        }

        if (initialSum == C) {
            return 1;
        }

        int start = 1;
        int end = B;
        while (end < A.length) {
            initialSum = A[end] - A[start] + initialSum;
            if (initialSum == C) {
                return 1;
            }
            end++;
            start++;
        }
        return 0;
    }
}
