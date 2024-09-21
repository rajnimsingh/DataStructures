package com.rajni.stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreater(new int[] {39,27,11,4,24,32,32,1})));
        // -1, 32, 24, 24, 32, -1, -1, -1

    }
    public static int[] nextGreater(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();

        result[A.length - 1] = -1;
        stack.push(A[A.length - 1]);
        for (int i = A.length - 2; i >= 0; i--) {
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
