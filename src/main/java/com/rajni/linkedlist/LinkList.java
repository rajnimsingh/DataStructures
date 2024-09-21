package com.rajni.linkedlist;

public class LinkList {
    private Node head;

    public static void main(String[] args) {
        Node newNode = new Node(1);
        LinkList list = new LinkList();
        list.insertNode(newNode);


        list.insertNode(new Node(2), 1);
        list.insertNode(new Node(4), 2);
        list.insertNode(new Node(5), 3);
        list.insertNode(new Node(3), 2);


         //list.deleteNode(3);


        //list.deleteNode(0);


        list.reverse();
        System.out.println(list.head);

    }

    public void insertNode(Node newNode, int k) {
        Node lastNode = null;
        Node currentNode = head;
        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        for (int i = 0 ; i < k; i++) {
            lastNode = currentNode;
            currentNode = currentNode.next;
        }
        assert lastNode != null;
        lastNode.next = newNode;
        newNode.next = currentNode;
    }
    public void insertNode(Node newNode) {
        insertNode(newNode, 0);
    }

    public void deleteNode(int k) {
        Node currentNode = head;
        Node lastNode = null;

        if (head == null) {
            return;
        }

        boolean valueExists = false;
        while (currentNode != null) {
            if (currentNode.data == k) {
                valueExists = true;
                break;
            }
            lastNode = currentNode;
            currentNode = currentNode.next;
        }

        if (valueExists && lastNode != null) {
            lastNode.next = lastNode.next.next;
        } else if (valueExists) {
            head = head.next;
        }
    }

    public void deleteNodeAtPosition(int k) {
        Node currentNode = head;
        Node lastNode = head;

        if (head == null) {
            return;
        }

        for (int i = 0; i < k; i++) {
            lastNode = currentNode;
            if (currentNode != null) {
                currentNode = currentNode.next;
            }
        }

        if (lastNode == head) {
            head = lastNode.next;
        } else if (lastNode != null && lastNode.next != null) {
            lastNode.next = lastNode.next.next;
        }

    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public int length() {
       int length = 0;
       Node current = head;
       while (current != null) {
           length++;
           current = current.next;
       }
       return length;
    }
}
