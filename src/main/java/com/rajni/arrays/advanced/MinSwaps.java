package com.rajni.arrays.advanced;

public class MinSwaps {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,12,10,3,14,10,5}, 8));
    }
    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                count++;
            }
        }

        if (count == 1) {
            return 0;
        }

        int badCount = 0;
        int windowSize = count;

        for (int i = 0; i < windowSize; i++) {
            if (A[i] > B) {
                badCount++;
            }
        }

        int answer = badCount;
        int start = 0;
        int end = windowSize;

        while (end < A.length) {
            if (A[start] > B) {
                badCount--;
            }
            if (A[end] > B) {
                badCount++;
            }
            answer = Math.min(answer, badCount);
            start++;
            end++;
        }
        return answer;
    }
}
