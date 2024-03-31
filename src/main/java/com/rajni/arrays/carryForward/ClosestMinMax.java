package com.rajni.arrays.carryForward;

public class ClosestMinMax {

    public static void main(String[] args) {
        System.out.println(closestMinMaxSubArrayLength(new int[] {2, 6, 1, 6, 9}));
        System.out.println(closestMinMaxSubArrayLength(new int[] {1, 3, 2}));
    }

    static int closestMinMaxSubArrayLength(int[] A) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            if (val < minValue) {
                minValue = val;
            }
            if (val > maxValue) {
                maxValue = val;
            }
        }

        int minIndex = -1;
        int maxIndex = -1;

        int minDistance = A.length;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == minValue) {
                minIndex = i;
                if (maxIndex != -1) {
                    minDistance = Math.min(maxIndex - minIndex + 1, minDistance);
                }
            } else if (A[i] == maxValue) {
                maxIndex = i;
                if (minIndex != -1) {
                    minDistance = Math.min(minIndex - maxIndex + 1, minDistance);
                }
            }
        }
        return minDistance;
    }
}
