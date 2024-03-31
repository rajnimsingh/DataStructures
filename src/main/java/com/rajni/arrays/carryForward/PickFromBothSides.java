package com.rajni.arrays.carryForward;
/**
 * You are given an integer array A of size N.
 * You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
 * Find and return the maximum possible sum of the B elements that were removed after the B operations.
 * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
 * Remove 3 elements from front and 0 elements from the back, OR
 * Remove 2 elements from front and 1 element from the back, OR
 * Remove 1 element from front and 2 elements from the back, OR
 * Remove 0 elements from front and 3 elements from the back.
 */
public class PickFromBothSides {
    public static void main(String[] args) {
        System.out.println(maxPossibleSum(new int[] {5, -2, 3 , 1, 2}, 3));
        System.out.println(maxPossibleSum(new int[] {2, 3, -1, 4, 2, 1 }, 4));
    }
    static int maxPossibleSum(int[] A, int B) {
        int maxSum = Integer.MIN_VALUE;
        int count = 0;
        while (count != B) {
            int startIndex = B - count - 1;
            int endIndex = A.length - count;

            int si = 0;
            int ei = A.length - 1;

            int currSum = 0;
            while (si <= startIndex) {
                currSum += A[si++];
            }
            while (ei < endIndex) {
                currSum += A[ei];
                ei++;
            }

            maxSum = Math.max(currSum, maxSum);
            count++;
        }
        return maxSum;
    }
}
