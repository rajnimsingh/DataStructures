package com.rajni.stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static int getPrecedence(char A) {
        switch (A) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public static String solve(String A) {
        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char val = A.charAt(i);
            if (val >= 'a' && val <= 'z') {
                result.append(val);
            } else if (val == '(') {
                stack.push(val);
            } else if (val == ')') {
                while (stack.peek() != '(') {
                    result.append(stack.pop());
                }
                // finally remove '(' as well.
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPrecedence(val) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(val);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
