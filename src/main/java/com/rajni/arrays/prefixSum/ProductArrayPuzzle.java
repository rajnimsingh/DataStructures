package com.rajni.arrays.prefixSum;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[] {1,2,3,4,5})));
    }
    static int[] productArray(int[] A) {
        int[] productArray = new int[A.length];

        int[] prefix = new int[A.length]; // {1, 1*2, 1*2*3, 1*2*3*4, 1*2*3*4*5}
        int[] suffix = new int[A.length]; // {5, 5*4, 5*4*3, 5*4*3*2, 5*4*3*2*1}

        int N = A.length - 1;
        prefix[0] = A[0];
        suffix[0] = A[N];

        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] * A[i];
            suffix[i] = suffix[i - 1] * A[N - i];
        }

        // System.out.println("Prefix : " + Arrays.toString(prefix));
        // System.out.println("Suffix : " + Arrays.toString(suffix));

        // Two edges 0 & N
        productArray[0] = suffix[N - 1];
        productArray[N] = prefix[N - 1];

        for (int i = 1; i < N; i++) {
            // 1-> 0 * 2-4
            productArray[i] = prefix[i - 1] * suffix[N - i - 1];
        }

        return productArray;
    }
}
