package com.rajni.strings;

import java.net.Inet4Address;

public class BoringStrings {
    public static void main(String[] args) {
        System.out.println(boringSubString("abcd"));
    }
    static int boringSubString(String A) {
        int evenMin = Integer.MAX_VALUE;
        int evenMax = Integer.MIN_VALUE;
        int oddMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;

        for (int i = 0 ; i < A.length(); i++) {
            int parity = A.charAt(i);
            if (parity % 2 == 0) {
                evenMin = Math.min(evenMin, parity - 96);
                evenMax = Math.max(evenMax, parity - 96);
            } else {
                oddMin = Math.min(oddMin, parity - 96);
                oddMax = Math.max(oddMax, parity - 96);
            }
        }
        if (Math.abs(evenMax - oddMin) != 1) {
            return 1;
        } else if (Math.abs(oddMax - evenMin) != 1) {
            return 1;
        }
        return 0;
    }
}
