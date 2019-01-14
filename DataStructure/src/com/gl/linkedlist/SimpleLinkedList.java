package com.gl.linkedlist;

/**
 * 
 * @author Arvind
 *
 *Very basic example of linked list implementation
 * 
 */
public class SimpleLinkedList {

	Node head;
	
	public static void main(String[] args) {
		
		// Node initialization
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		//Instantiating the linked list
		SimpleLinkedList ll = new SimpleLinkedList();
		
		//initializing head of linked list
		ll.head = node1;
		
		//linking other elements to head
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		
		//Iterate over linked list and print the elements
		Node tmp = ll.head;
		while(tmp.next != null) {
			System.out.print(tmp.data + ", ");
			tmp = tmp.next;
		}
		
	}

//Inner class representing the node of the linked list
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
}
