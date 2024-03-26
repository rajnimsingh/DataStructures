package com.rajni.arrays.basics;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(checkIfPairExists(new int[] {3, -2, 1, 4,3,6, 8}, 10));
    }
    static int checkIfPairExists(int[] array, int k) {
        for (int i = 0 ; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if ((array[i] + array[j]) == k) {
                    System.out.println("Pair found : (" + array[i] +" , " + array[j] + ")");
                    return 1;
                }
            }
        }
        return 0;
    }
}
