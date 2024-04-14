package com.rajni.searching;

public class PainterPartitioning {
    public static void main(String[] args) {
        //System.out.println(paint( 4, 10, new int[] {884,228,442,889}));
        System.out.println(paint(1, 1000000, new int[] {1000000,1000000}));
    }

    public static int paint(int A, int B, int[] C) {
        int minTime = Integer.MIN_VALUE;
        int totalTime = 0;
        long answer = 1;
        for (int i = 0; i < C.length; i++) {
            minTime = Math.max(minTime, C[i]);
            totalTime += C[i];
        }

        long start = (long) minTime * B;
        long end = (long) totalTime * B;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (isPossibleToPaint(C, mid, B, A)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) (start % 10000003);
    }

    public static boolean isPossibleToPaint(int[] C, long totalTime, int timeUnit, int painters) {
        long timeToBeConsumed = totalTime;
        int requiredPainters = 1;
        for (int i = 0; i < C.length; i++) {
            long boardTimeRequiredToPaint = (long) C[i] * timeUnit;
            if (boardTimeRequiredToPaint > totalTime) {
                return false;
            }

            if (boardTimeRequiredToPaint <= timeToBeConsumed) {
                timeToBeConsumed -= boardTimeRequiredToPaint;
            } else {
                requiredPainters++;
                timeToBeConsumed = totalTime - boardTimeRequiredToPaint;

            }
        }

        return requiredPainters <= painters;
    }
}
