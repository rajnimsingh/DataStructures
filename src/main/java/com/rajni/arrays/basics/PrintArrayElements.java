package com.rajni.arrays.basics;

public class PrintArrayElements {
    public static void main(String[] args) {
        print(new int[] {1,2,3,4,5,6,7});
    }
    static void print(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}
