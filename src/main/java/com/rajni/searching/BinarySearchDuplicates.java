package com.rajni.searching;

public class BinarySearchDuplicates {
    public static void main(String[] args) {
        System.out.println(findFirstIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, 0));
        System.out.println(findFirstIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, -5));
        System.out.println(findFirstIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, 7));

        System.out.println(findLastIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, 0));
        System.out.println(findLastIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, -5));
        System.out.println(findLastIndex(new int[] {
                -5, -5, -3, 0, 0, 0, 2, 5, 7, 7
        }, 7));
    }
    static int findFirstIndex(int[] A, int K) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == K && (mid == 0 || A[mid] != A[mid - 1])) {
                return mid;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int findLastIndex(int[] A, int K) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == K && (mid == A.length - 1 || A[mid] != A[mid+1])) {
                return mid;
            } else if (A[mid] > K) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
