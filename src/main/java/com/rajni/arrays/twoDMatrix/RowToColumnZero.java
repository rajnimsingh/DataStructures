package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4},
                {0,6,7,0},
                {9,2,0,4}
        };

        System.out.println(Arrays.deepToString(rowToColumnZeroOptimized(A)));
    }

    static int[][] rowToColumnZeroOptimized(int[][] A) {

        // check if any row has zero, discard that rows values
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            boolean zeroExists = false;
            for (int j = 0; j < M; j++) {

                if (A[i][j] == 0) {
                    zeroExists = true;
                    break;
                }
            }

            if (zeroExists) {
                for (int j = 0; j < N; j++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }

        // check if any column in zero, discard that column value
        for (int i = 0; i < M; i++) {
            boolean zeroExists = false;
            for (int j = 0 ; j < N; j++) {
                if (A[j][i] == 0) {
                    zeroExists = true;
                    break;
                }
            }
            if (zeroExists) {
                for (int j = 0; j < N; j++) {
                    if (A[j][i] != 0) {
                        A[j][i] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
    static int[][] rowToColumnZeroMatrix(int[][] A) {
        int[][] result = new int[A.length][A[0].length];

        int rowsLength = A.length;
        int colLength = A[0].length;

        for (int i = 0 ; i < A.length; i++) {
            for (int j = 0 ; j < colLength; j++) {
                result[i][j] = -1;
            }
        }

        for (int i = 0 ; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                int value = A[i][j];
                if (value == 0) {
                    int rowIndex = i;
                    int colIndex = 0;
                    while (colIndex < colLength) {
                        result[rowIndex][colIndex++] = 0;
                    }
                    colIndex = j;
                    rowIndex = 0;
                    while (rowIndex < rowsLength) {
                        result[rowIndex++][colIndex] = 0;
                    }

                } else {
                    if (result[i][j] == -1) {
                        result[i][j] = A[i][j];
                    }
                }
            }
        }
        return result;
    }
}
