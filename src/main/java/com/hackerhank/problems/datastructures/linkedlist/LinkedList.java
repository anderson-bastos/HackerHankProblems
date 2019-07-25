package com.hackerhank.problems.datastructures.linkedlist;

public class LinkedList {
	
	private LinkedList() {
		throw new IllegalStateException("Utility class");
	}
	
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
	
	static void reversePrint(SinglyLinkedListNode head) {
		int quantityLinkedLists = head.data;
		int countQuantityLists = 0;
		while(countQuantityLists < quantityLinkedLists && head.next != null) {
			head = head.next;			
			int countElementsLinkedList = 0;			
			SinglyLinkedListNode previus = null;
			SinglyLinkedListNode current = head.next;
			SinglyLinkedList llist = new SinglyLinkedList();
			while(countElementsLinkedList < head.data) {
				llist.insertNode(current.data);
				previus = current;
				current = current.next;				
				countElementsLinkedList++;								
			}			
			head = previus;
			printList(reverse(llist.head));
			countQuantityLists++;
		}
    }
	
	static SinglyLinkedListNode reverse(SinglyLinkedListNode node) { 
		SinglyLinkedListNode prev = null; 
		SinglyLinkedListNode current = node; 
		SinglyLinkedListNode next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
	
	// prints content of double linked list 
    static void printList(SinglyLinkedListNode node) { 
        while (node != null) { 
            System.out.println(node.data); 
            node = node.next; 
        } 
    } 
    
    public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertNode(3);
		linkedList.insertNode(5);
		linkedList.insertNode(16);
		linkedList.insertNode(12);
		linkedList.insertNode(4);
		linkedList.insertNode(2);
		linkedList.insertNode(5);
		linkedList.insertNode(3);
		linkedList.insertNode(7);
		linkedList.insertNode(3);
		linkedList.insertNode(9);
		linkedList.insertNode(5);
		linkedList.insertNode(5);
		linkedList.insertNode(1);
		linkedList.insertNode(18);
		linkedList.insertNode(3);
		linkedList.insertNode(13);
		
		reversePrint(linkedList.head);
	}
}
