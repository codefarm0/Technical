package com.gl.linkedlist;

public class DoublyLinkedListDemo {

	static Node head;
	public static void main(String[] args) {
		
		System.out.println("**********Initialize the doublu linked list**********");
		initializeDLL();
		printDLL();
		System.out.println("**********Insert element into the doubly linked list**********");
		insertIntoDLL(100);
		printDLL();

		 System.out.println("**********Delete element from the doubly linked list**********");
		 deleteFromDLL(100); 
		 printDLL();
		 
		 System.out.println("**********Replace given element with new element from the doubly linked list**********"); 
		 replaceElementFromDLL(1, 200); 
		 printDLL();
	}

	
	private static void replaceElementFromDLL(int toRemove, int toAdd) {

		Node node = new Node(toAdd);
		if(head.data == toRemove) {
			node.next = head.next;
			head = node;
		}else {
			System.out.println("The given element to replace is not head pointer");
		}
	}


	private static void deleteFromDLL(int toDelete) {
		
		Node delNode = new Node(toDelete);
		
		if(head.data == delNode.data) {
			head = head.next;
		}else {
			System.out.println("The given element to delete is not the head pointer");
		}
		
	}

/**
 *  Add element at the front of linked list
 * @param newElement
 */
	private static void insertIntoDLL(int newElement) {
		Node node = new Node(newElement);//create the node
		node.next=head;//move head to next of new node
		node.prev=null;//prev of new head will be null
		if(head != null) {//if list is not empty
			head.prev = node;
		}
		
		head = node;
		
	}


	private static void printDLL() {
		Node tmp = head;
		while(tmp !=null) {
			System.out.print(tmp.data + ", ");
			tmp = tmp.next;
		}
		System.out.println();
		
	}


	private static void initializeDLL() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		head = n1;
		n1.next=n2;
		n1.prev=null;
		n2.next=n3;
		n2.prev=n1;
		n3.next=n4;
		n3.prev=n2;
		n4.next=null;
		n4.prev=n3;
				
		
	}


	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
}
