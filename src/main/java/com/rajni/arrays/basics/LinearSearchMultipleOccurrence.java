package com.rajni.arrays.basics;

public class LinearSearchMultipleOccurrence {

    public static void main(String[] args) {
        System.out.println(countOccurrence(new int[] {1,2,2,2,2,4,5,6,7}, 2));
    }
    static int countOccurrence(int[] A, int B) {
        int count = 0;
        for (int val : A) {
            if (val == B) {
                count++;
            }
        }

        return count;
    }
}
