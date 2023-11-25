package com.example.DSA;


	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class SinglyLinkedList {
	    Node head;

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

	public class SinglyLinkedListExample {
	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);

	        System.out.print("Singly Linked List: ");
	        list.display();
	    }
	}
