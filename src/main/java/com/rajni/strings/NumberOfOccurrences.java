package com.rajni.strings;

public class NumberOfOccurrences {
    public static int countOccurrences(String A, String B) {
        int count = 0;

        int windowSize = B.length();
        int start = 0;
        int end = windowSize;

        while (start < windowSize && A.charAt(start) != B.charAt(start)) {
            start++;
        }

        if (start == windowSize) {
            count++;
        }
        
        return count;
    }
}
