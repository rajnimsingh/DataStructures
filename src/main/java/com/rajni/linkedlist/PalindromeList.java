package com.rajni.linkedlist;

public class PalindromeList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(palindrome(head));

    }
    public static int palindrome(Node A) {
        int result = 1;

        int length = length(A);
        int mid = length / 2;
        int count = 0;
        Node current = A;
        Node previous = null;
        while (count < mid) {
            previous = current;
            current = current.next;
            count++;
        }

        if (previous != null) {
            previous.next = null;
        }

        if (current != null) {
            Node middleNode = current;
            Node secondHalf = reverse(current);
            Node firstHalf = A;
            while (secondHalf != null && firstHalf != null) {
                if (secondHalf.data != firstHalf.data) {
                    result = 0;
                    return result;
                }

                secondHalf = secondHalf.next;
                firstHalf = firstHalf.next;
            }
        }



        return result;
    }

    public static Node reverse(Node A) {
        Node current = A;
        Node previous = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static int length(Node A) {
        int length = 0;
        Node current = A;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
