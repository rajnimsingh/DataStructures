package com.rajni.searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(50));
        System.out.println(sqrt(25));
    }
    public static int sqrt(int A) {
        int start = 0;
        int end = A;

        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid <= A && (mid + 1) * (mid + 1) > A) {
                return mid;
            } else if (mid * mid > A) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}
