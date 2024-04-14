package com.rajni.searching;

public class RotatedArraySearch {
    public static void main(String[] args) {
        System.out.println(rotateArraySearch(new int[]{101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100}, 202));
    }

    static int rotateArraySearch(int[] A, int B) {
        if (A[0] > A[A.length - 1]) {
            int start = 0;
            int end = A.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (A[mid] == B) {
                    return mid;
                }
                // target lies in green array A1
                if (A[0] <= B) {
                    if (A[mid] > A[0]) {
                        if (A[mid] < B) {
                            start = mid + 1;
                        } else {
                            end = mid - 1;
                        }
                    } else {
                        end = mid - 1;
                    }
                } else { // target lies in red array, A2
                    if (A[mid] < A[0]) { // mid lies in red
                        if (A[mid] < B) {
                            start = mid + 1;
                        } else {
                            end = mid - 1;
                        }
                    } else {
                        start = mid + 1;
                    }

                }
            }
        }
        return -1;
    }
}
