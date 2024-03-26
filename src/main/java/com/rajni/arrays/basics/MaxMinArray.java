package com.rajni.arrays.basics;

public class MaxMinArray {

    public static void main(String[] args) {
        maxMin(new int[] {0,3,56,232,76,1,2,6,888,-4545});

        maxMin(new int[] {1,1,1,1,1,1,1});

        maxMin(new int[] {9, 9});
    }

    static void maxMin(int[] A) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0 ; i < A.length; i++) {
            int val = A[i];

            if (val < minElement) {
                minElement = val;
            } else if (val > maxElement) {
                maxElement = val;
            }
        }

        System.out.println("Min Value : " + minElement);
        System.out.println("Max Value : " + maxElement);
    }
}
