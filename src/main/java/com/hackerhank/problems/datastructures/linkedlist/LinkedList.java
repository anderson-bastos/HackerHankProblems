package com.hackerhank.problems.datastructures.linkedlist;

public class LinkedList {
	
	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep){
		while (node != null) {			
			System.out.print(node.data);
			node = node.next;
			if (node != null) {
				System.out.print(sep);				
			}
		}
	}

	/**
	 * @Problem Insert a Node at The Tail of a Linked List
	 * @param head
	 * @param data
	 * {@link https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem}
	 * @return SinglyLinkedListNode
	 */
	public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		if(head == null)
            return new SinglyLinkedListNode(data);
        
        SinglyLinkedListNode previus = null;
        SinglyLinkedListNode current = head;
        
        while(current != null) {
            previus = current;
            current = current.next;
        }        
        previus.next = new SinglyLinkedListNode(data);        
        return head;
	}
	
	/**
	 * Problem Insert a Node at The Head of a Linked List
	 * @param llist
	 * @param data
	 * @return
	 * {@link https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem}
	 */
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode nodeAux = llist;
        llist = new SinglyLinkedListNode(data);
        llist.next = nodeAux;                
        return llist;
    }
	
	/**
	 * 
	 * @param head
	 * @param data
	 * @param position
	 * @return
	 */
	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		if(head == null)
			return new SinglyLinkedListNode(data);
		
		int currentPosition = 0;
		SinglyLinkedListNode previus = null;
		SinglyLinkedListNode current = head;
		while(position > currentPosition) {
			previus = current;
			current = current.next;
			currentPosition++;
		}		
		insertBetweenPosition(data, previus, current);
		return head;
    }

	private static void insertBetweenPosition(int data, SinglyLinkedListNode previus, SinglyLinkedListNode current) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		if(previus != null) {
			previus.next = node;
		}
		node.next = current;
	}
	
	
}
