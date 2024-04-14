package com.rajni.searching;

public class MatrixMedian {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        matrix = new int[][] {
                {1,3,5},
                {2,6,9},
                {3,6,9}
        };

        System.out.println(findMedian(matrix));
    }
    public static int findMedian(int[][] A) {
        int ans = -1;
        int rows = A.length;
        int cols = A[0].length;
        int requiredCount = (rows * cols / 2) + 1;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            minElement = Math.min(minElement, A[i][0]);
            maxElement = Math.max(maxElement, A[i][cols - 1]);
        }


        int low = minElement;
        int high = maxElement;

        while (low <= high) {
            int mid = (low + high) / 2;

            // check count of how many values in each row <= mid
            int count = 0;
            for (int i = 0 ; i < rows; i++) {
                count += calculateCountOfElementsLessThanMid(A[i], mid);
            }

            if (count >= requiredCount) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    static int calculateCountOfElementsLessThanMid(int[] A, int mid) {
        int count = 0;
        if (A[A.length - 1] < mid) {
            return A.length;
        }  else {
            int s = 0;
            int l = A.length - 1;
            int answer = 0;
            while (s <= l) {
                int m = (s + l) / 2;
                if (A[m] <= mid) {
                    s = m + 1;
                } else {
                    l = m - 1;
                }
            }
            return s;
        }
    }
}
