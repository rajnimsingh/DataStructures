package com.rajni.searching;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 8, 12, 17};

       // System.out.println(isPossibleToPlaceCows(A, 4, 4));
       // System.out.println(placeCows(A, 4));

        A = new int[] {1,2,3,4,5};
        //System.out.println(placeCows(A, 3));

        A = new int[] {5, 17, 100, 11};
        System.out.println(placeCows(A, 2));
    }

    public static int placeCows(int[] A, int B) {
        Arrays.sort(A);
        int start = 1;
        int end = A[A.length - 1] - A[0];
        int answer = 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossibleToPlaceCows(A, B, mid)) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }

    public static boolean isPossibleToPlaceCows(int[] A, int B, int distanceGiven) {
        int remainingCowsToBePlaced = B - 1;
        int lastCow = A[0];
        for (int i = 1; i < A.length && remainingCowsToBePlaced > 0; i++) {
            if (A[i] - lastCow >= distanceGiven) {
                lastCow = A[i];
                remainingCowsToBePlaced--;
            }
        }

        if (remainingCowsToBePlaced == 0) {
            return true;
        }
        return false;
    }
}
