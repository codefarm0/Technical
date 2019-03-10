package com.gl.linkedlist.sll;


public class DeleteElementAtGivenPosition {

	static Node head;  
	public static void main(String[] args) {
		
		System.out.println("**********Initializing linked list**********");
		initializeLinkedList();
		printList();
		System.out.println("**********After deleting element at position 3 **********");
		deleteNodeAtPos(4);
		printList();
	}

	private static void printList() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.print(tmp.data +", ");
			tmp=tmp.next;
		}
		System.out.println();
		
	}

	private static void deleteNodeAtPos(int posToDeleted) {
		if(head == null) {
			System.out.println("Nothing to delete, list is already robbed");
			return;
		}
		if(posToDeleted ==0) {
			head = head.next;
			return;
		}
		Node tmp = head;
		Node prev = null;
		int counter=0;
		while(tmp!=null) {
			prev = tmp;
			counter++;
			if(posToDeleted == counter) {
				tmp=tmp.next;
				break;
			}
			
			tmp=tmp.next;
		}
		if(tmp == null) {
			System.out.println("Position to delete exceded the length of list");
			return;
		}
		
		prev.next=prev.next.next;

		
	}

	private static void initializeLinkedList() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node11 = new Node(11);
		Node node22 = new Node(22);

		head = node1;
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
