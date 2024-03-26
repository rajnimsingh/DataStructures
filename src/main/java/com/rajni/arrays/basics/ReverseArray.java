package com.rajni.arrays.basics;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        reverse(new int[] {0,1,2,3,4,5});

        reverse(new int[] {0,1,2,3,4,5,6});

        reverseRange(new int[] {0,1,2,3,4,5}, 1, 4);

        reverseRange(new int[] {0,1,2,3,4,5,6}, 2,6);
    }

    static void reverse(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(A));
    }

    static void reverseRange(int[] A, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(A));
    }
}
