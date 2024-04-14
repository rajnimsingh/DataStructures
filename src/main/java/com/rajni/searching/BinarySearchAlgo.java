package com.rajni.searching;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 67, 78, 89};
        System.out.println(search(A, 14));
        System.out.println(search(A, 78));
    }
    static int search(int[] A, int K) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == K) {
                return mid;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
