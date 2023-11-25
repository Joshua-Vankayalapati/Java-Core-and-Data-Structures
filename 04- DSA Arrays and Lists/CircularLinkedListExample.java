package com.example.DSA;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println(" (back to head)");
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Circular Linked List: ");
        list.display();
    }
}