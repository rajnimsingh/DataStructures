package com.rajni.stacks;

import java.util.Stack;

public class BalancedParanthesis {
    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                char opening = stack.pop();
                if ((ch == ')' && opening != '(') || (ch == '}' && opening != '{') || (ch == ']' && opening != '[')
                ) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
