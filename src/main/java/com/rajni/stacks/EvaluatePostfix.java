package com.rajni.stacks;

import java.util.Stack;

public class EvaluatePostfix {
    public int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            String val = A[i];

            switch (val) {
                case "+":
                    Integer op1 = stack.pop();
                    Integer op2 = stack.pop();
                    stack.push(op1 + op2);
                    break;
                case "-":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 - op1);
                    break;
                case "*":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 * op1);
                    break;
                case "/":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2/op1);
                    break;
                default:
                    stack.push(Integer.parseInt(val));

            }
        }
        return stack.pop();
    }
}
