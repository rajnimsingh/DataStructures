package com.rajni.stacks;

import java.util.Stack;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] A = new int[] {992387,932142,971117,934674,988917,967890,948508,970347};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        long sum = 0L;
        long mod = 1000000007;
        // find next smaller element for min from left and right side
        // find next greater element for max from left and right side
        int[] nextGreaterOnLeft = findNextGreaterOnLeft(A);
        int[] nextGreaterOnRight = findNextGreaterOnRight(A);
        int[] nextSmallerOnLeft = findNextSmallerOnLeft(A);
        int[] nextSmallerOnRight = findNextSmallerOnRight(A);

        for (int i = 0; i < A.length; i++) {
            long maxContrib = (long) A[i] * (i - nextGreaterOnLeft[i]) * (nextGreaterOnRight[i] - i);
            long minContrib = (long) A[i] * (i - nextSmallerOnLeft[i]) * (nextSmallerOnRight[i] - i);
            sum = (sum + maxContrib - minContrib + mod) % mod;
        }
        return (int) sum;
    }

    private static int[] findNextGreaterOnLeft(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = A.length -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    private static int[] findNextGreaterOnRight(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = A.length - 1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    private static int[] findNextSmallerOnLeft(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = A.length - 1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    private static int[] findNextSmallerOnRight(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = A.length - 1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
