package com.rajni.arrays.subarrays;

public class SubArraySum {
    public static void main(String[] args) {
        //printEachSubArraySum(new int[] {22, 44, 55, 66,87, 89, 122});
        printEachSubArraySum(new int[] {6, 8, -1, 7});
        printEachSubArraySum(new int[] {4, 3, 7});

        printSubArraySumUsingContributionTechnique(new int[] {6, 8, -1, 7});
        printSubArraySumUsingContributionTechnique(new int[] {4, 3, 7});
    }
    static void printEachSubArraySum(int[] A) {
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                totalSum += sum;
            }
            //System.out.println("Sum : " + sum);

        }
        System.out.println("TotalSum = " + totalSum);
    }

    static void printSubArraySumUsingContributionTechnique(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += (A[i] * (i + 1) * (A.length - i));
        }
        System.out.println("Sum : " +sum);
    }
}
