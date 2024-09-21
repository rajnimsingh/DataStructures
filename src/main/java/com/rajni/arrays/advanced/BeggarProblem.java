package com.rajni.arrays.advanced;

import java.util.Arrays;

public class BeggarProblem {

    public static void main(String[] args) {
        int[] A = new int[7];
        int[][] Q = {
                {1, 3},
                {2, 5},
                {5, 6}
        };
        int[] V = {2, 3, -1};

        returnFinalArray(A, Q, V);
        System.out.println(Arrays.toString(A));
    }
    static void returnFinalArray(int[] A, int[] Q, int[] V) {

        for (int i = 0 ; i < Q.length; i++) {
            int index = Q[i];
            int val = V[i];
            if (index < A.length) {
                // this is valid index
                A[index] += val;
            }
        }

        for (int i = 1; i < A.length; i++) {
            A[i] = A[i] + A[i-1];
        }
    }

    static void returnFinalArray(int[] A, int[][] Q, int[] V) {
        for (int i = 0 ; i < Q.length; i++) {
            int startIndex = Q[i][0];
            int endIndex = Q[i][1];
            int val = V[i];

            assert startIndex < A.length && endIndex < A.length;

            A[startIndex] += val;
            if (endIndex < A.length - 1) {
                A[endIndex + 1] -= val;
            }
        }

        for (int i = 1; i < A.length; i++) {
            A[i] = A[i] + A[i-1];
        }
    }
}
