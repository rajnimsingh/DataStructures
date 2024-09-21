package com.rajni.strings;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(solve("p", "pccdpeeooadeocdoacddapacaecb"));
    }

    public static int solve(String A, String B) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        int count = 0;

        for(int i = 0 ; i < A.length(); i++) {
            freqB[B.charAt(i) - 'a']++;
            freqA[A.charAt(i) - 'a']++;
        }

        if (compareArrays(freqA, freqB) == 1) {
            count++;
        }

        int start = 1;
        int end = A.length();
        int N = B.length();
        while(end < N) {
            freqB[B.charAt(start - 1) - 'a']--;
            freqB[B.charAt(end) - 'a']++;
            if (compareArrays(freqA, freqB) == 1) {
                count++;
            }

            end++;
            start++;
        }
        return count;

    }

    private static int compareArrays(int[] A, int[] B) {
        int start = 0;
        while(start < 25) {
            if (A[start] != B[start]) {
                return 0;
            }
            start++;
        }

        return 1;
    }
}
