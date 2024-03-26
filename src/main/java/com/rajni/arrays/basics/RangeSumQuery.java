package com.rajni.arrays.basics;

public class RangeSumQuery {
    public static int[] findSumOfRange(int[] A, int[][] B) {
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {


            int start = B[i][0];
            int end = B[i][1];
            int sum = 0;
            while (start <= end) {
                sum += A[start++];
            }

            result[i] = sum;
        }

        return result;
    }
}
