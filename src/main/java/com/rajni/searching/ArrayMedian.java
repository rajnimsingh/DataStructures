package com.rajni.searching;

import java.util.List;

public class ArrayMedian {
    public static void main(String[] args) {
        //System.out.println(findMedianSortedArrays(List.of(-50, -41, -40, -19, 5, 21, 28), List.of(-50, -21, -10)));
        System.out.println(findMedianSortedArrays(List.of(), List.of(20)));
    }
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        double median = 0.0;
        if (a.size() < b.size()) {
            return findMedianSortedArraysHelper(a, b);
        }

        return findMedianSortedArraysHelper(b, a);
    }

    private static double findMedianSortedArraysHelper(final List<Integer> a, final List<Integer> b) {
        double median = 0.0;

        int totalElements = a.size() + b.size();

        int l = 0;
        int r = a.size();

        while (l <= r) {
            int midA = (l + r) / 2;
            int midB = ((totalElements + 1) / 2) - midA; // for odd case take an extra element

            int maxLeftA = midA == 0 ? Integer.MIN_VALUE : a.get(midA - 1);
            int minRightA = midA == a.size() ? Integer.MAX_VALUE : a.get(midA);

            int maxLeftB = midB == 0 ? Integer.MIN_VALUE : b.get(midB - 1);
            int minRightB = midB == b.size() ? Integer.MAX_VALUE : b.get(midB);

            if (maxLeftA <= minRightB && maxLeftB <= minRightA ) {
                if (totalElements % 2  == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            }

            if (maxLeftA > minRightB) {
                r = midA - 1;
            } else {
                l = midA + 1;
            }
        }
        return median;
    }
}
