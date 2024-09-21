package com.rajni.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // 97,63,89,34,82,95,4,70,14,41,38,83,49,32,68,56,99,52,33,54 -> 13, 15

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = new Node(8);

       // Node result = reverse1(node, 2, 3); // working4
      //  result = reverse1(node, 1, 7); // working
      //  result = reverse1(node, 4, 6);


        Node n = new Node(1);
        Node added = add(n, 2);
        Node added2 = add(added, 3);

        print(reverse1(n, 2, 3));

    }

    public static Node add(Node node, int value) {
        Node newNode = new Node(value);
        node.next = newNode;
        return newNode;
    }

    public static Node reverse1(Node A, int B, int C) {
        Node from = null;
        Node to = null;
        Node current = A;
        Node first = null;
        Node last = null;

        int count = 0;
        while (current != null) {
            count++;
            if (count < B) {
                first = current;
            } else if (count == B) {
                from = current;
            }

            if (count == C) {
                to = current;
                last = to.next;
                break;
            }

            current = current.next;
        }

        if (to != null) {
            to.next = null;
        }

        reverse(from);

        if (first != null) {
            first.next = to;
        } else {
            A = to;
        }

        if (from != null) {
            from.next = last;
        }


        System.out.print("FROM = ");
        print(from);
        System.out.print("TO = ");
        print(to);
        System.out.print("A = ");
        print(A);
        return A;
    }

    static Node reverse(Node node) {
        Node current = node;
        Node previous = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;

        }
        return previous;
    }
    public static Node reverseBetweenOld(Node A, int B, int C) {
        int start = 1;
        int end = B;

        Node rangeStart = A;
        Node firstPart = A;
        if (B != 1) {
            while (start != B) {
                firstPart = rangeStart;
                rangeStart = rangeStart.next;
                start++;
            }
            firstPart.next = null;
        } else {
            firstPart = null;
        }

        Node rangeEnd = rangeStart;
        while (end != C) {
            rangeEnd = rangeEnd.next;
            end++;
        }
        Node lastPart = null;
        if (rangeEnd != null) {
            lastPart = rangeEnd.next;
            rangeEnd.next = null;
        }

        int count = 0;
        Node current = rangeStart;
        Node previous = null;
        while (count != (C - B + 1)) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
            count++;
        }

        Node reversedPart = previous;

        return connectAllLists(firstPart, reversedPart, lastPart);
    }

    static Node connectAllLists(Node firstPart, Node reversedPart, Node lastPart) {

        Node currentNode = firstPart;
        Node previous = null;
        while (currentNode != null) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (previous != null) {
            previous.next = reversedPart;
        }

        currentNode = reversedPart;
        while (currentNode != null) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (previous != null) {
            previous.next = lastPart;
        }

        if (firstPart == null) {
            firstPart = reversedPart;
        }

        return firstPart;
    }

    public static Node reverseBetween(Node A, int B, int C) {
        Node firstPart = null;
        Node reversePart = A;
        if (B != 1) {
            Node temp = A;
            Node prev = null;
            int start = 1;
            while (start != B) {
                prev = temp;
                temp = temp.next;
                start++;
            }
            firstPart = prev;
            reversePart = temp;
            firstPart.next = null;
        }

        print(firstPart);


        // compute reversePart
        Node reversed = reverse(reversePart, B, C);

        Node lastPart = null;
        Node temp = reversed;
        while (temp != null) {
            lastPart = temp;
            temp = temp.next;
        }

        if (lastPart != null) {
            lastPart.next = lastPart;
        }

        print(firstPart);
        print(reversed);
        print(lastPart);

        return A;
    }


    static Node reverse(Node node, int B, int C) {
        int count = 0;
        Node current = node;
        Node previous = null;
        while (count != (C - B + 1)) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
            count++;
        }



        return previous;
    }

    static void print(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + "->" );
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findFirstHalf(Node A, int B) {
        if (B == 1) {
            return null;
        }

        int start = 1;
        Node current = A;
        Node previous = null;
        while (start != B) {
            previous = current;
            current = current.next;
            start++;
        }

        return previous;
    }

    public static Node findSecondHalf(Node A, int C) {
        int start = 1;
        Node current = A;
        while (start != C) {
            current = current.next;
            start++;
        }
        Node lastPart = null;
        if (current != null) {
            lastPart = current.next;
            current.next = null;
        }
        return lastPart;
    }


}
