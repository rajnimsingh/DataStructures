package com.rajni.linkedlist;

public class LongestPalindromeSequence {

    public static int longestPalindrome(Node A) {
        int answer = 0;

        Node current = A;
        Node prev = null;

        while (current != null) {
            Node left = prev;
            Node right = current.next;

            int length = getMaxLength(left, right);
            answer = Math.max(answer, 2 * length + 1);

            left = prev;
            right = current;
            length = getMaxLength(left, right);
            answer = Math.max(answer, 2 * length);

            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        return answer;
    }

    public static int getMaxLength(Node A, Node B) {
        int length = 0;
        while (A != null && B != null) {
            if (A.data == B.data) {
                A = A.next;
                B = B.next;
                length++;
            } else {
                break;
            }
        }
        return length;
    }
}
