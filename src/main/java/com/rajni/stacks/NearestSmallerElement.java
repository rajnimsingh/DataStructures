package com.rajni.stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(prevSmaller(new int[] {34,35,27,42,5,28,39,20,28})));
        System.out.println(Arrays.toString(prevSmaller(new int[] {39,27,11,4,24,32,32,1})));
    }
    public static int[] prevSmaller(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < A.length; i++) {
            if (stack.isEmpty()) {
                result[i] = -1;
                stack.push(A[i]);
            } else if (stack.peek() < A[i]) {
                result[i] = stack.peek();
                stack.push(A[i]);

            } else {
                while (!stack.isEmpty() && stack.peek() >= A[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
                stack.push(A[i]);
            }

        }
        return result;
    }

    private static int[] nextSmaller(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        result[A.length - 1] = -1;
        stack.push(A[A.length - 1]);

        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(A[i]);
        }
        return result;
    }
}
