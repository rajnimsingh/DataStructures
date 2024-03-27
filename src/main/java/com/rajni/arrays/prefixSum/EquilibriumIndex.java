package com.rajni.arrays.prefixSum;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-3, 2, 4, -1};
        System.out.println(equilibriumIndex(A));

        System.out.println(equilibriumIndex(new int[] {-7, 1, 5,2, -4,3,0}));
    }
    public static int equilibriumIndex(int[] A) {
        int result = -1;
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        for (int i = 0 ; i < A.length; i++) {
            if (i == 0 || i == A.length - 1) {
                if (i == 0 && prefixSum[prefixSum.length - 1] - A[0] == 0) {
                    result = 0;
                    break;
                }
                if (i == A.length - 1 && prefixSum[i - 1] == 0) {
                    result = 0;
                    break;
                }
            } else {
                int leftSum = prefixSum[i - 1];
                int rightSum = prefixSum[prefixSum.length - 1] - prefixSum[i];
                if (leftSum == rightSum) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
