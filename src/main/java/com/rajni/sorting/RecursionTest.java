package com.rajni.sorting;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }

    public static int recursiveFactorial(int number) {
        if(number == 0) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }
    public static int iterativeFactorial(int number) {
        if(number == 0) {
            return 1;
        }
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
