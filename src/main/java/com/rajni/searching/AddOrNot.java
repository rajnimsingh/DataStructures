package com.rajni.searching;

import java.util.Arrays;

public class AddOrNot {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addOrNotBruteForceSolution(new int[]{3, 1, 2, 2, 1}, 3)));
        System.out.println(Arrays.toString(addOrNotBruteForceSolution(new int[]{5, 5, 5}, 3)));

        System.out.println(Arrays.toString(addOrNot(new int[]{3, 1, 2, 2, 1}, 3)));
        System.out.println(Arrays.toString(addOrNot(new int[]{5, 5, 5}, 3)));

        int[] A = {
                381365713, -62084283, 102305001, 287760871, -12055265, -166122549, -4734071, 1, 1, 1, 1, 37635432, 12534298, 311111152};
        System.out.println(Arrays.toString(addOrNot(A, 21)));

    }

    static int[] addOrNot(int[] A, int B) {
        Arrays.sort(A);
        long[] pSum = new long[A.length + 1];
        pSum[0] = 0l;
        for (int i = 0; i < A.length; i++) {
            pSum[i + 1] = (long) (pSum[i] + A[i]);
        }
        int maxValue = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {

            // use binary search for finding combination
            int low = 1;
            int high = i + 1;

            while (low <= high) {
                int mid = (high + low) / 2;
                long expectedVal = (long) A[i] * mid;
                long actualVal = pSum[i + 1] - pSum[i - mid + 1]; // elements from mid to i , i-mid + 1
                if ((expectedVal - actualVal) <= B) {
                    if (maxCount < mid) {
                        maxCount = mid;
                        maxValue = A[i];
                    }
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }


        return new int[]{maxCount, maxValue};
    }

    static int[] addOrNotBruteForceSolution(int[] A, int B) {
        int[] result = new int[2];
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            int operationsNeeded = 0;

            for (int j = i; j >= 0; j--) {

                if (A[i] - A[j] <= B) {
                    operationsNeeded += (A[i] - A[j]);
                    if (operationsNeeded > B) {
                        break;
                    }
                    count++;
                }
                if (count > result[0]) {
                    result[0] = count;
                    result[1] = A[i];
                }
            }
        }
        return result;
    }
}
