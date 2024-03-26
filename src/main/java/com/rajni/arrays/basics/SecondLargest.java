package com.rajni.arrays.basics;

public class SecondLargest {

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[] {2,3,4,99,98, 100, 105, 103}));
    }
    static int findSecondLargest(int[] A) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0 ; i < A.length; i++) {
            if (A[i] > largest) {
                secondLargest = largest;
                largest = A[i];
            } else if (A[i] > secondLargest && A[i] < largest) {
                secondLargest = A[i];
            }
        }
        return secondLargest;
    }
}
