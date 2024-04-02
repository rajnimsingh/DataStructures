package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        rotateMatrix(A);
        System.out.println(Arrays.deepToString(A));
    }

    static void rotateMatrix(int[][] A) {
        // transpose the matrix
        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A[0].length; j++) {

                if (i != j) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }
        // reverse each row's elements
        for (int i = 0; i < A.length; i++) {
            int[] row = A[i];
            int N = row.length - 1;
            for (int j = 0; j < A.length / 2; j++) {
                int temp = row[j];
                row[j] = row[N - j];
                row[N- j] = temp;
            }
        }
    }
}
