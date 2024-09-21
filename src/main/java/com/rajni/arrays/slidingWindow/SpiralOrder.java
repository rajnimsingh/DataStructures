package com.rajni.arrays.slidingWindow;

import java.util.Arrays;

public class SpiralOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralOrder(5)));
    }
    public static int[][] spiralOrder(int A) {
        int[][] matrix = new int[A][A];
        int row = 0;
        int column = 0;
        int value = 1;
        while (A > 1) {
            for (int k = 1; k < A; k++) {
                matrix[row][column++] = value++;
            }

            for (int k = 1; k < A; k++) {
                matrix[row++][column] = value++;
            }

            for (int k = 1; k < A; k++) {
                matrix[row][column--] = value++;
            }

            for (int k = 1; k < A; k++) {
                matrix[row--][column] = value++;
            }

            row++;
            column++; A-= 2;
        }

        if (A == 1) {
            matrix[row][column] = value;
            return matrix;
        }

        return matrix;
    }
}
