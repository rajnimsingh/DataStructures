package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] A = {
                {4,3,1,7},
                {6,2,3,4},
                {5,3,2,7}
        };

        System.out.println(Arrays.toString(rowWiseSum(A)));
    }
    static int[] rowWiseSum(int[][] A) {
        int[] sumArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < A[i].length; j++) {
                rowSum += A[i][j];
            }
            sumArray[i] = rowSum;
        }
        return sumArray;
    }
}
