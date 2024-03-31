package com.rajni.arrays.subarrays;

public class CountOccurrence {
    public static void main(String[] args) {
        System.out.println(countOccurrenceOfValue(new int[] {3, -2, 4, -1, 2, 6}, -1));
    }
    static int countOccurrenceOfValue(int[] A, int B) {
        int index = -1;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                index = i;
                break;
            }
        }

        count = (index + 1) * (A.length - index);
        return count;
    }
}
