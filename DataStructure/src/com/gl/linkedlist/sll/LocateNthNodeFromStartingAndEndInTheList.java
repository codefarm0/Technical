package com.gl.linkedlist.sll;

public class LocateNthNodeFromStartingAndEndInTheList {

	static Node head;

	public static void main(String[] args) {
		System.out.println("**********Initializing linked list**********");
		initializeLinkedList();
		printList();
		locateELementFromBegining(1);
		locateELementFromBegining(2);
		locateELementFromBegining(3);
		locateELementFromBegining(4);
		
		locateElementFromLast(1);
		locateElementFromLast(2);
		locateElementFromLast(3);
		locateElementFromLast(4);
		locateElementFromLast(50);

	}

	private static void locateELementFromBegining(int posToLocate) {
		Node myPointer = head;
		int counter = 1;
		if (head != null) {
			while (counter < posToLocate) {
				if (myPointer != null) {
					myPointer = myPointer.next;
					counter++;
				}
			}
		}
		if (myPointer != null) {
			System.out.println("Element at location " + posToLocate + " from begining is " + myPointer.data);
		} else {
			System.out.println("Given position " + posToLocate + " is out of reach from linked list");
		}

	}

	private static void locateElementFromLast(int posToLocate) {
		Node firstPointer = head;
		Node secondPointer = head;
		int counter = 0;
		boolean isFound = true;
		if (head != null) {
			while (counter < posToLocate) {
				if (firstPointer != null) {
					firstPointer = firstPointer.next;
					
				} else {
					isFound = false;
				}
				counter++;
				

			}
			while (firstPointer != null) {
				firstPointer = firstPointer.next;
				secondPointer = secondPointer.next;
			}
		} else {
			System.out.println("linked list is empty");
		}
		if (isFound) {
			System.out.println("Element at location " + posToLocate + " from last is - " + secondPointer.data);
		} else {
			System.out.println("Given position " + posToLocate + " is out of reach of linked list");
		}

	}

	private static void initializeLinkedList() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node11 = new Node(11);
		Node node22 = new Node(22);

		head = node1;
		node1.next = node2;
		node2.next = node11;
		node11.next = node22;

	}

	private static void printList() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + ", ");
			tmp = tmp.next;
		}
		System.out.println();

	}

	// Inner class representing the node of the linked list
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

}
