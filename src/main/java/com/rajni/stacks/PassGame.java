package com.rajni.stacks;

import java.util.Stack;

public class PassGame {
    public static int solve(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();

        stack.push(B);
        for (int i = 0; i < A; i++) {
            if (C[i] != 0) {
                stack.push(C[i]);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }
}
