package com.gl.linkedlist;

/**
 * 
 * @author Arvind
 * 
 *         Adding elements at following locations 
 *         1. Front 
 *         2. After a given node
 *         3. Before a given node 
 *         4. end of the node
 *
 */
public class AddingElementsIntoDLL {

	static Node head;

	public static void main(String[] args) {
		System.out.println("*********Initialize DLL*********");
		initializeDLL();
		printDLL();
		System.out.println("*********push at the head of linked list*********");
		insertAtFrontOfTheDLL(100);
		printDLL();
		System.out.println("*********push after given node*********");
		insertAfterGivenNodeDLL(2, 400);
		printDLL();
		System.out.println("*********push before given node*********");
		insertBeforeGivenNodeDLL(100, 200);
		printDLL();
		System.out.println("*********push at the end of linked list*********");
		insertAtEndOfDLL(1000);
		printDLL();

	}

	private static void insertAtEndOfDLL(int toAdd) {
		Node tmp = head;
		Node last = null;
		while (tmp != null) {
			last = tmp;
			tmp = tmp.next;
		}
		Node node = new Node(toAdd);
		last.next = node;
		node.prev = last;

	}

	/**
	 * 
	 * @param givenNodeData
	 * @param toAdd
	 */
	private static void insertBeforeGivenNodeDLL(int givenNodeData, int toAdd) {
		Node laterNode = null;

		Node tmp = head;
		boolean isPresent = false;
		while (tmp != null) {
			if (tmp.data == givenNodeData) {
				isPresent = true;
				laterNode = tmp;
				break;
			}
			tmp = tmp.next;
		}
		if (!isPresent) {
			System.out.println("Given pointer node is not present in the DLL, please give correct node");
			return;
		}
		Node newNode = new Node(toAdd);

		newNode.next = laterNode;
		newNode.prev = laterNode.prev;
		laterNode.prev = newNode;
		if (newNode.prev != null) {
			newNode.prev.next = newNode;
		} else {
			head = newNode;
		}

	}

	private static void insertAfterGivenNodeDLL(int givenNodeData, int toAdd) {
		Node previousNode = null;

		Node tmp = head;
		boolean isPresent = false;
		while (tmp != null) {
			if (tmp.data == givenNodeData) {
				isPresent = true;
				previousNode = tmp;
				break;
			}
			tmp = tmp.next;
		}
		if (!isPresent) {
			System.out.println("Given pointer node is not present in the DLL, please give correct node");
			return;
		}
		Node newNode = new Node(toAdd);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
		newNode.prev = previousNode;
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}

	}

	private static void printDLL() {
		Node tmp = head;
		Node last = null;
		while (tmp != null) {
			System.out.print(tmp.data + ", ");
			last = tmp;
			tmp = tmp.next;
		}
		System.out.print(" --back gear now --->");
		while (last != null) {
			System.out.print(last.data + ", ");
			last = last.prev;
		}
		System.out.println();

	}

	private static void insertAtFrontOfTheDLL(int data) {
		Node node = new Node(data);
		node.next = head;
		if (head != null) {
			head.prev = node;
		}
		head = node;

	}

	private static void initializeDLL() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		head = n1;
		n1.next = n2;
		n1.prev = null;
		n2.next = n3;
		n2.prev = n1;
		n3.next = n4;
		n3.prev = n2;
		n4.next = null;
		n4.prev = n3;
	}

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

}
