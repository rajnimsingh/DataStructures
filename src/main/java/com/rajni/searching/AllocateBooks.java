package com.rajni.searching;

public class AllocateBooks {
    public static void main(String[] args) {
        int[] A = {73,58,30,72,44,78,23,9};
        int B = 5;
        System.out.println(books(A, B));
    }
    public static int books(int[] A, int B) {
        int left = Integer.MAX_VALUE;
        int right = 0;
        int answer = -1;

        for (int i = 0; i < A.length; i++) {
            left = Math.max(left, A[i]);
            right += A[i];
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            long pages = isPossible(A, B, mid);
            if (isPossible(A, B, mid) != -1) {
                right = mid - 1;
                answer = (int) pages;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static long isPossible(int[] A, int B, int P) {
        int remainingStudents = B - 1;
        long lastStudent = A[0];
        long currentSum = A[0];
        long maxSum = currentSum;
        for (int i = 1; i < A.length; i++) {
            if ((A[i] + currentSum ) <= P) {
                currentSum += A[i];
            } else {
                maxSum = Math.max(currentSum, maxSum);
                currentSum = A[i];
                lastStudent = A[i];
                remainingStudents--;

            }
        }
        if (remainingStudents == 0) {
            return maxSum;
        }
        return -1l;
    }
}
