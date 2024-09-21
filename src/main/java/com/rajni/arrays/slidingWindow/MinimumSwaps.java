package com.rajni.arrays.slidingWindow;

/**
 * Given an array of integers A and an integer B,
 * find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 *
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 */
public class MinimumSwaps {
    public static void main(String[] args) {
        System.out.println(calculateMinSwaps(new int[] {1, 12, 10, 3, 14, 10, 5}, 8));
    }
    public static int calculateMinSwaps(int[] A, int B) {
        int windowSize = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                windowSize++;
            }
        }

        if (windowSize <= 1) {
            return 0;
        }
        int badCount = 0;
        for (int i = 0; i < windowSize; i++) {
            if (A[i] > B) {
                badCount++;
            }
        }
        int answer = badCount;
        int start = 1;
        int end = windowSize;
        while (end < A.length) {
            if (A[start - 1] > B) {
                badCount--;
            }
            if (A[end] > B) {
                badCount++;
            }

            end++;
            start++;

            answer = Math.min(answer, badCount);
        }
        return answer;
    }
}
