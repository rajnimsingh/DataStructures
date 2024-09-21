package com.rajni.stacks;

import java.util.Arrays;

public class ArraysStack {
    private int top;
    private int[] stack;

    public ArraysStack() {
        stack = new int[10];
    }

    public void push(int element) {
        if (top == stack.length) {
            // create more space as this is already full
            this.stack = Arrays.copyOf(stack, 2 * stack.length);
        }
        stack[top++] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
        return stack[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        ArraysStack stack = new ArraysStack();
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        for (int i = 1; i <=20; i++) {
            stack.push(i);
        }
        for (int i = 1; i <=20; i++) {
            System.out.println(stack.pop());
        }
    }
}
