package com.rajni.maths;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,3,4,5}, 2));
    }
    public static int solve(int[] A, int B) {
        int[] count = new int[B];
        long answer = 0l;
        int mod = 1000000007;

        for (int i = 0; i < A.length; i++) {
            count[A[i] % B]++;
        }

        int i = 0, j = B - 1;
        while (i <= j) {
            if (i == j || i == 0) {
                answer = answer + (count[i] * (count[i] - 1)) / 2;
            } else {
                answer = answer + (count[i] * count[j]);
            }
            i++;
            j--;
        }


        return (int) answer % mod;
    }
}
