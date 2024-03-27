package com.rajni.arrays.carryForward;

public class CountLeaders {
    public static void main(String[] args) {
        System.out.println(countLeaders(new int[] {15, -1, 7,2,5,4,2,3}));
        System.out.println(countLeaders(new int[] {10, 7, 9, 2, 3, 4}));
    }
    static int countLeaders(int[] A) {
        int leaders = 0;
        int max = Integer.MIN_VALUE;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                leaders++;
            }
        }
        return leaders;
    }
}
