package com.rajni.arrays.advanced;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {0,0,0,9,9,9})));
    }
    public static int[] plusOne(int[] A) {
        int carry = 1;
        for (int i = A.length - 1 ; i >= 0; i--) {
            int number = A[i] + carry;
            carry = 0;
            if (number > 9) {
               carry = 1;
                number = number % 10;
            }
            A[i] = number;
            if (carry == 0) {
                break;
            }
        }

        int ansLength = A.length;
        if (carry == 0) {
            for (int i = 0 ; i < A.length; i++) {
                if (A[i] != 0) {
                    ansLength = ansLength - i;
                    break;
                }
            }
        } else {
            // this will be applicable for one digit array
            ansLength = ansLength + 1;
        }
        int[] ans = new int[ansLength];
        if (carry == 1) {
            ans[0] = 1;
        }
        int end = Math.min(ansLength, A.length);
        for (int i = 1; i <= end; i++) {
            ans[ansLength - i] = A[A.length - i];
        }
        return ans;
    }
}
