package com.rajni.arrays.subarrays;

public class PrintSubArray {
    public static void main(String[] args) {
       // print(new int[] {22, 44, 55, 66,87, 89, 122}, 0, 7);
        //print(new int[] {22, 44, 55, 66,87, 89, 122}, 2, 4);
        printAll(new int[] {22, 44, 55, 66,87, 89, 122});
    }
    static void print(int[] A, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(A[i]);
        }
    }
    static void printAll(int[] A) {
        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {
                System.out.print("{");
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k] + ", ");
                }
                System.out.println("}");
            }
        }
    }
}
