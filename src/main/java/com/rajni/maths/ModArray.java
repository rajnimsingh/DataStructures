package com.rajni.maths;

public class ModArray {
    public static void main(String[] args) {
        System.out.println(arrayMod(new int[] {4, 3, 5, 3, 5, 3, 2, 1}, 47));
    }
    public static int arrayMod(int[] A, int P) {
        int N = A.length - 1;
        long t = 1;
        long sum = 0;
        for (int i = N; i >= 0; i--) {
            sum += (A[i] * t) % P;
            t = (t * 10) % P;
        }
        return (int) (sum % P);
    }
}
