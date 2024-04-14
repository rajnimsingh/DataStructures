package com.rajni.searching;

public class PeakElement {
    public static void main(String[] args) {
        int[] A = {1,3,5,10,15,12,6};
        System.out.println(peakElement(A));
    }
    static int peakElement(int[] A) {
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid == 0 || (A[mid] > A[mid - 1])) &&
                    (mid == A.length - 1 || A[mid] > A[mid + 1])) {
                return A[mid];
            } else if ((mid == 0 || (A[mid] > A[mid - 1]))) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
