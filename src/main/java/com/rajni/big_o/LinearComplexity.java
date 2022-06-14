package com.rajni.big_o;

public class LinearComplexity {
    public static void main(String[] args) {
        String[] array = {"Hello", "My", "Name", "Is", "Rajni"};
        String key = "Rajni";

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                System.out.println("Found " + key + " at index " + i);
            }
        }
    }
}
