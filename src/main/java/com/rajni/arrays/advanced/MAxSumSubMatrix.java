package com.rajni.arrays.advanced;

public class MAxSumSubMatrix {
    public static void main(String[] args) {
        int[][] A = {{-83,-73,-70,-61},{-56,-48,-13,4},{38,48,71,71}};
        System.out.println(solve(A));
    }
    public static long solve(int[][] A) {
        int N = A.length - 1;
        int M = A[0].length - 1;

        long[][] pSum = new long[N + 1][M + 1];
        long maxSum = Long.MIN_VALUE;
        for (int i = N; i >= 0; i-- ) {

            for (int j = M; j >= 0; j--) {

                pSum[i][j] = (long) A[i][j];

                if (j + 1 <= M) {
                    pSum[i][j] += pSum[i][j + 1];
                }

                if (i + 1 <= N) {
                    pSum[i][j] += pSum[i + 1][j];
                }

                if ((i + 1) <= N && (j + 1) <= M) {
                    pSum[i][j] = pSum[i][j] - pSum[i + 1][j + 1];
                }

                maxSum = Math.max(maxSum, pSum[i][j]);
            }
        }

        return maxSum;
    }
}
