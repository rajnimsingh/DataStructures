package com.rajni.arrays.subarrays;

/*

Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.

*/
public class CountingSubArrays {
    public static void main(String[] args) {
        System.out.println(countSubArrays(new int[] {2, 5, 6}, 10));
        System.out.println(countSubArrays(new int[] {1, 11, 2, 3, 15}, 10));
    }
    static int countSubArrays(int[] A, int B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum < B) {
                    count++;
                   // break;
                }
            }
        }
        return count;
    }
}
