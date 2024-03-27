package com.rajni.arrays.prefixSum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfRange {

    public static void main(String[] args) {
        int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] B = {
                {4, 8},
                {3, 7},
                {1, 3},
                {0, 4},
                {7, 7}
        };

        int[] result = sumOfRange(A, B);
        System.out.println(Arrays.toString(result));
    }
    static int[] sumOfRange(int[] A, int[][] B) {
        int[] result = new int[B.length];

        int[] prefixSum = new int[A.length];

        prefixSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        // To do this in Java 8
        //IntStream.range(1, A.length).forEach(i -> prefixSum[i] = prefixSum[i-1] + A[i]);

        for (int i = 0 ; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];

            if (start == 0) {
                result[i] = prefixSum[end];
            } else {
                result[i] = prefixSum[end] - prefixSum[start - 1];
            }
        }
        return result;
    }
}
