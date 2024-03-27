package com.rajni.arrays.carryForward;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs(new char[] {'b', 'c','a','g','a','a','g','g'}));
    }
    static int countPairs(char[] ch) {
        int count = 0;

        int answer = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == 'g') {
                count++;
            }
            if (ch[i] == 'a') {
                answer += count;
            }
        }
        return answer;
    }
}
