package com.rajni.arrays.basics;

public class ElementGreaterThanItself {
    public static void main(String[] args) {
        System.out.println(numberOfElementsGreaterThanItself(new int[] {-3, 2, 6, 8, 4, 8, 5}));
    }
    static int numberOfElementsGreaterThanItself(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int maxFreq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxFreq = 1;
            } else if (array[i] == maxElement) {
                maxFreq++;
            }
        }
        return(array.length - maxFreq);
    }
}
