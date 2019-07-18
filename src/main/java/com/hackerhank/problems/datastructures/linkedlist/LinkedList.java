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
		findAndInsertNodeOnTail(head, data);		
		return head;
	}

	private static void findAndInsertNodeOnTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode current = head;
		while(current.next != null) {			
			current = current.next;
		}		
		current.next = new SinglyLinkedListNode(data);
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
}
