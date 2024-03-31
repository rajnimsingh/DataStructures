package com.rajni.arrays.carryForward;

public class FaultyBulbs {
    public static void main(String[] args) {
        System.out.println(minimumNumberOfSwitches(new int[] {0, 1, 0, 1}));
        System.out.println(minimumNumberOfSwitches(new int[] {1, 1, 1, 1}));
    }
    static int minimumNumberOfSwitches(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            // switch has been pressed even number of times, original state will remain same
            if (count % 2 == 0 && A[i] == 0) {
                count++;
            } else if (count % 2 == 1 && A[i] == 1) {// switch has been pressed odd number of times, original state will change
                count++;
            }
        }

        return count;
    }
}
