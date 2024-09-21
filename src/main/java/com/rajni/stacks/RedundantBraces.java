package com.rajni.stacks;

import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) {
        System.out.println(braces("((a+b))"));
    }
    public static int braces(String A) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '(' || ch == '*' || ch == '+' || ch == '-' || ch == '/' || ch == '^' || ch == '%') {
                stack.push(ch);
            } else if (ch == ')') {
                // if we found any consecutive bracket..
                if (!stack.isEmpty() && stack.peek() == '(') {
                    return 1;
                }
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return !stack.isEmpty() ? 1 : 0;
    }
}
