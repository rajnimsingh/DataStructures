package com.rajni.arrays.twoDMatrix;

import java.util.Arrays;

public class ColWiseSum {
    public static void main(String[] args) {
        int[][] A = {
                {4,3,1,7},
                {6,2,3,4},
                {5,3,2,7}
        };

        System.out.println(Arrays.toString(colWiseSum(A)));

        int[][] B = {
                {4,3,7},
                {6,2,3,4},
                {5,3}
        };
        System.out.println(Arrays.toString(colWiseSumForRectangularArray(B)));
    }
    static int[] colWiseSum(int[][] A) {
        int colIndex = 0;
        int[] colSumArray = new int[A[0].length];
        while (colIndex < A[0].length) {
            int rowIndex = 0;
            int colSum = 0;
            while (rowIndex < A.length) {
                colSum += A[rowIndex++][colIndex];
            }
            colSumArray[colIndex++] = colSum;
        }
        return colSumArray;
    }

    static int[] colWiseSumForRectangularArray(int[][] A) {
        int colIndex = 0;

        int maxCols = 0;
        for (int i = 0 ; i < A.length; i++) {
            maxCols = Math.max(A[i].length, maxCols);
        }
        int[] colSumArray = new int[maxCols];
        while (colIndex < maxCols) {
            int rowIndex = 0;
            int colSum = 0;
            while (rowIndex < A.length) {
                if (colIndex < A[rowIndex].length) {
                    colSum += A[rowIndex][colIndex];
                }
                rowIndex++;
            }
            colSumArray[colIndex++] = colSum;
        }
        return colSumArray;
    }
}
