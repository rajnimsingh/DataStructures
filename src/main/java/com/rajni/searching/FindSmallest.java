package com.rajni.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSmallest {

    public static void main(String[] args) {
        int[] A = {22,10,5,11,16,2,11,7,16,2,17,6,15,3,9,6};
        int B = 183;

        System.out.println(findSmallest(A, B));
    }

    public static int findSmallest(int[] A, int B) {
        Arrays.sort(A);
        int answer = -1;

        int N = A.length;
        int low = A[0] + A[1] + A[2];
        int high = A[N - 3 ] + A[N - 2] + A[N - 1];

        while (low <= high) {
            int mid = (low + high) / 2;
            // check how many triplets have sum < mid
            int count = 0;

            for (int i = 0; i < N; i++) {
                int si = i + 1;
                int ei = N - 1;

                while (si < ei) {
                    if (A[i] + A[si] + A[ei] < mid) {
                        count += (ei - si);
                        si++;
                    } else {
                        ei--;
                    }
                }
            }

            if (count < B) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }
    public int findSmallestBthElementBruteForce(int[] A, int B) {
        Arrays.sort(A);
        List<Integer> tripletsList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {

            for (int j = i + 1; j < A.length; j++) {
                int tripletSum = 0;
                for (int k = j + 1; k < A.length; k++) {
                    tripletSum += A[k];
                }
                tripletsList.add(tripletSum);
            }
        }
        return tripletsList.get(B - 1);
    }
}
