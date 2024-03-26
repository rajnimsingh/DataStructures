package com.rajni.arrays.basics;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[] {3, -2, 1, 4, 6, 9, 8}, 3);
        rotate(new int[] {3, -2, 1, 4, 6, 9, 8}, 8);
    }
    public static void rotate(int[] A, int k) {
        int n = A.length;
        k = k % n;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, A.length - 1);

        System.out.println(Arrays.toString(A));
    }
    private static void reverse(int[] A, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
}
