package com.rajni.arrays.twoDMatrix;

public class PrintDiagonals {
    public static void main(String[] args) {
        int[][] A = {
                {4,3,1,7},
                {6,2,3,4},
                {5,3,2,7},
                {1,2,3,4}
        };

        printDiagonals(A);
        System.out.println();
        printDiagonalsRightToLeft(A);
        System.out.println();
        printAllDiagonals(A);
    }
    static void printDiagonals(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i][i]);
        }
    }

    static void printDiagonalsRightToLeft(int[][] A) {
        int N = A.length;
        int i = 0;
        int j = N - 1;

        while (i < N && j >= 0) {
            System.out.println(A[i++][j--]);
        }

    }

    static void printAllDiagonals(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int colIndex = 0;
        while (colIndex < cols) {
            int rowIndex = 0;
            int col = colIndex;
            System.out.print("{");
            while (rowIndex <= colIndex && col >= 0) {
                System.out.print(A[rowIndex++][col--] + ", ");
            }
            System.out.println("}");
            colIndex++;
        }
        // other remaining elements
        int row = 1;
        while (row < rows) {
            int col = colIndex - 1;
            int rowIndex = row;
            System.out.print("{");
            while (rowIndex < A.length && col > 0) {
                System.out.print(A[rowIndex++][col--] + ", ");
            }
            System.out.println("}");
            row++;
        }
    }
}
