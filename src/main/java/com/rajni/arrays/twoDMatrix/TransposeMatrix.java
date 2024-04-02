package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {4,3,1,7},
                {6,2,3,4},
                {5,3,2,7},
                {1,2,3,4}
        };
        transposeSquareMatrix(A);

        System.out.println(Arrays.deepToString(A));
        int[][] B = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        System.out.println(Arrays.deepToString(transposeRectangularMatrix(B)));
    }
    static void transposeSquareMatrix(int[][] A) {
        for (int i = 0 ; i < A.length; i++) {

            for (int j = i; j < A[0].length; j++) {
                if (i != j) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }
    }

    static int[][] transposeRectangularMatrix(int[][] A) {
        int[][] transposedArray = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            int[] cols = A[i];
            for (int j = 0; j < cols.length; j++) {
                transposedArray[j][i] = cols[j];
            }
        }
        return transposedArray;
    }
}
