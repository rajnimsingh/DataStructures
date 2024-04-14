package com.rajni.searching;

public class UniqueElement {
    public static void main(String[] args) {
        int[] A = {8, 8, 2 , 2, 6, 5, 5};
        System.out.println(uniqueElement(A));

        A = new int[]{1, 8, 8, 2 , 2, 6, 6, 5, 5};
        System.out.println(uniqueElement(A));

        A = new int[]{8, 8, 2 , 2, 6, 6, 5, 5, 9};
        System.out.println(uniqueElement(A));
    }
    static int uniqueElement(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((mid == 0 || A[mid] != A[mid - 1]) &&
                    (mid == A.length - 1 || A[mid] != A[mid + 1])) {
                return A[mid];
            } else if (mid == 0 || A[mid] != A[mid - 1]) {
                if (mid % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (mid % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
