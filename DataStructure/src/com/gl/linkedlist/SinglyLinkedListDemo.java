package com.gl.linkedlist;


/**
 * 
 * @author Arvind
 *
 *
 *         This class explains about the linked list implementation in java with
 *         following operation - 
 *         1. add element 
 *         2. remove element 
 *         3. replace element
 */
public class SinglyLinkedListDemo {

	Node head;

	public static void main(String[] args) {

		SinglyLinkedListDemo sll = new SinglyLinkedListDemo();

		System.out.println("**********Initializing linked list**********");
		initializeLinkedList(sll);
		printElementsOfLinkedList(sll);
		System.out.println("\n**********Adding element at the end of the linked list**********");
		addElement(sll, 40);
		printElementsOfLinkedList(sll);
		System.out.println("\n**********Removing particular element from the linked list**********");
		removeElement(sll, 11);
		printElementsOfLinkedList(sll);
		System.out.println("\n**********Replacing an element from the linked list**********");
		replaceElement(sll, 1, 100);
		printElementsOfLinkedList(sll);

	}

	private static void addElement(SinglyLinkedListDemo linkedList, int elementToAdd) {

		Node node = new Node(elementToAdd);// creating node with the help of element to add

		if (linkedList.head == null) {
			// it means list is empty. Make the node as head node
			linkedList.head = node;
		}
		Node tmp = linkedList.head;
		while (tmp.next != null) {// moving towards tail/end of the linked list
			tmp = tmp.next;
		}

		tmp.next = node;// adding the node to last position

	}

	private static void removeElement(SinglyLinkedListDemo linkedList, int elementToRemove) {

		if (linkedList.head == null) {
			System.out.println("There is nothing to delete, the linked list has already been robbed!!");
			return;
		}

		Node tmp = linkedList.head;
		boolean found = false;
		if (tmp.data == elementToRemove) {
			// it's the first element to remove
			linkedList.head = linkedList.head.next;
			found = true;
		}
		while (tmp.next != null && !found) {
			if (tmp.next.data == elementToRemove) {
				tmp.next = tmp.next.next;
				found = true;
				break;
			}
			tmp = tmp.next;
		}
		if (found) {
			System.out.println("--Element removed from the linked list - " + elementToRemove);
		} else {
			System.out.println("--Element to be removed not found in the linked list - " + elementToRemove);
		}

	}

	private static void replaceElement(SinglyLinkedListDemo linkedList, int elementToReplace, int elementToAdd) {

		Node nodeToAdd = new Node(elementToAdd);
		Node nodeToReplace = new Node(elementToReplace);
		boolean flag = false;
		if (linkedList.head.data == nodeToReplace.data) {
			//if the element to replace is head of the linked lsit
			nodeToAdd.next = linkedList.head.next;
			linkedList.head = nodeToAdd;
			flag = true;
		}
		
		Node tmp = linkedList.head;
		while(!flag && tmp.next != null) {
			if(tmp.next.data == elementToReplace) {
				nodeToAdd.next = tmp.next.next;
				tmp.next = nodeToAdd;
				flag = true;
			}
		}
		if (flag) {
			System.out.println("--Element - "+elementToReplace+" replaced by - "+elementToAdd + " from the linked list - ");
		} else {
			System.out.println("--Element - "+elementToReplace+" to be replaced not found in the linked list - ");
		}

	}

	private static void printElementsOfLinkedList(SinglyLinkedListDemo linkedList) {

		Node tmp = linkedList.head;
		while (tmp != null) {
			System.out.print(tmp.data + ", ");
			tmp = tmp.next;
		}

	}

	private static void initializeLinkedList(SinglyLinkedListDemo linkedList) {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node11 = new Node(11);
		Node node22 = new Node(22);

		linkedList.head = node1;
		node1.next = node2;
		node2.next=node11;
		node11.next=node22;

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
