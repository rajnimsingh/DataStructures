package com.rajni.stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public String solve(String A) {
        Stack<Character> stack = new Stack<>();
        if (A.length() > 0) {
            stack.push(A.charAt(0));
        }
        for (int i = 1; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }
}
