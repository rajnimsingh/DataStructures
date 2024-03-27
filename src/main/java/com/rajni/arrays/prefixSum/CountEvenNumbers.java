package com.rajni.arrays.prefixSum;

import java.util.Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] A = {2,4,3,7,9,8,6,5,4,9};
        int[][] B = {
                {3,9},
                {0,4}
        };

        System.out.println(Arrays.toString(countEvenNumbers(A, B)));
    }
    static int[] countEvenNumbers(int[] A, int[][] B) {
        int[] evenNumbers = new int[B.length];

        int[] evenCounts = new int[A.length];
        if (A[0] % 2 == 0) {
            evenCounts[0] = 1;
        } else {
            evenCounts[0] = 0;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenCounts[i] = evenCounts[i - 1] + 1;
            } else {
                evenCounts[i] = evenCounts[i - 1];
            }
        }

        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];

            if (start == 0) {
                evenNumbers[i] = evenCounts[end];
            } else {
                evenNumbers[i] = evenCounts[end] - evenCounts[start - 1];
            }
        }
        return evenNumbers;
    }
}
