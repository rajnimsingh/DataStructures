package com.rajni.maths;

public class DivisibilityBy3 {
    public static void main(String[] args) {

    }
    /**
     * Given a number in the form of an array A of size N.
     * Each of the digits of the number is represented by A[i].
     * Check if the number is divisible by 3.
     */
    public static int divideBy3(int[] A) {
        long sum = 0;
        long t = 1;
        for (int i = 0; i < A.length; i++) {
            sum = sum + (A[i] * t) % 3;
            t = (t * 10) % 3;
        }
        return sum % 3 == 0 ? 1 : 0;
    }
}
