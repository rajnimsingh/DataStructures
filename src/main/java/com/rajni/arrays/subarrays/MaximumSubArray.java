package com.rajni.arrays.subarrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println(maxPossibleSum(new int[] {2, 1, 3, 4, 5}, 12));
        System.out.println(maxPossibleSum(new int[] {2, 2, 2}, 1));
    }
    static int maxPossibleSum(int[] A, int B) {
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            int currSum = 0;
            for (int j = i; j < A.length; j++) {
                currSum += A[j];
                if (currSum > B) {
                    break;
                }
                sum = Math.max(sum, currSum);
            }

        }
        return sum;
    }
}
