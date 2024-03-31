package com.rajni.arrays.subarrays;
/*

Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

*/
public class GoodSubArrays {
    public static void main(String[] args) {
        System.out.println(countSubArrays(new int[] {1, 2, 3, 4, 5}, 4));
        System.out.println(countSubArrays(new int[] {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9}, 65));
    }
    static int countSubArrays(int[] A, int B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {

                int lengthOfSubArray = (j - i + 1);
                sum += A[j];
                if ((lengthOfSubArray & 1) == 0 && sum < B) {
                    //System.out.println("Length of subArray is even");
                    count++;
                } else if ((lengthOfSubArray & 1) != 0 && sum > B) {
                   // System.out.println("Length of subArray is odd");
                    count++;
                }


            }
        }
        return count;
    }
}
