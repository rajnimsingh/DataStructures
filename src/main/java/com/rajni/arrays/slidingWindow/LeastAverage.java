package com.rajni.arrays.slidingWindow;

/**
 * Given an array A of size N, find the subarray of size B with the least average.
 * Return the index of the first element of the subarray of size B that has least average.
 * Array indexing starts from 0.
 */

public class LeastAverage {

    public static void main(String[] args) {
        System.out.println(leastAverage(new int[] {3, 7, 90, 20, 10, 50, 40}, 3));
    }

    public static int leastAverage(int[] A, int B) {
        int sum = 0;

        int answer = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int result = sum;
        int start = 1;
        int end = B;
        while (end < A.length) {
            sum = sum + A[end] - A[start - 1];
            if (sum < result) {
                result = sum;
                answer = start;
            }
            end++;
            start++;
        }
        return answer;
    }
}
