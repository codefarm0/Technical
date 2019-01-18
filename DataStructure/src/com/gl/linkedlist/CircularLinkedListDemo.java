package com.gl.linkedlist;

/**
 * 
 * @author 
 *
 *Circular linked list - unidirectional
 */
public class CircularLinkedListDemo {

	static Node head;

	public static void main(String[] args) {
		System.out.println("***********Initialize circular linked list***********");
		initializeCLL();
		printCLL();

		System.out.println("\n***********Insert data at the head of circular linked list***********");
		insertIntoCLL(100);
		insertIntoCLL(200);
		insertIntoCLL(300);
		insertIntoCLL(400);
		insertIntoCLL(500);
		insertIntoCLL(600);
		printCLL();

		System.out.println("\n***********Delete head node from the linked list***********");
		deleteFromCLL();
		deleteFromCLL();
		deleteFromCLL();
		deleteFromCLL();
		printCLL();

	}

	private static void deleteFromCLL() {
		Node tmp = head;
		while (tmp.next != head) {
			tmp = tmp.next;
		}
		Node last = tmp;
		Node first = last.next;
		last.next = first.next;
		first = first.next;
		head = first;

	}

	private static void initializeCLL() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node1;
		head = node1;

	}

	private static void printCLL() {
		Node tmp = head;
		while (tmp.next != head) {
			System.out.print(tmp.data + ",");
			tmp = tmp.next;
		}
		System.out.print(tmp.data);// printing last node

	}

	// this method will insert at the head of CLL only
	private static void insertIntoCLL(int data) {
		Node node = new Node(data);

		Node last = head;
		while (last.next != head) {
			last = last.next;
		}
		last.next = node;
		node.next = head;
		head = node;

	}

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

}
