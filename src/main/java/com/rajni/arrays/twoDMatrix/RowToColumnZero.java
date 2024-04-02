package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4},
                {0,6,7,0},
                {9,2,0,4}
        };

        System.out.println(Arrays.deepToString(rowToColumnZeroMatrix(A)));
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
