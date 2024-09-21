package com.rajni.maths;

public class PowerMod {
    public static void main(String[] args) {
        System.out.println(powerWithMod(2, 3, 3));
    }
    /**
     * You are given A, B and C .
     * Calculate the value of (A ^ B) % C
     */
    public static int powerWithMod(int A, int B, int C) {
        long answer = 1;

        for (int i = 1; i <= B; i++) {
            answer = (answer * A) % C;
        }
        return (int) answer % C;
    }
}
