package com.hackerhank.problems.implementations.datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hackerhank.problems.datastructures.linkedlist.LinkedList;
import com.hackerhank.problems.datastructures.linkedlist.SinglyLinkedList;
import com.hackerhank.problems.datastructures.linkedlist.SinglyLinkedListNode;

public class LinkedListTest {
	
	@Test
	public void insertNodeAtTailTest() {		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		int[] elements = {1, 2, 3, 4};
		for (int i = 0; i < elements.length; i++) {
			SinglyLinkedListNode node = LinkedList.insertNodeAtTail(singlyLinkedList.head, elements[i]);
			singlyLinkedList.head = node;
		}
		Assertions.assertEquals(elements[0], singlyLinkedList.head.data);
	}
	
	@Test
	public void insertNodeAtPositionTest() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insertNode(16);
		singlyLinkedList.insertNode(13);
		singlyLinkedList.insertNode(7);		
		SinglyLinkedListNode llist_head = LinkedList.insertNodeAtPosition(singlyLinkedList.head, 1, 2);

        Assertions.assertEquals(16, llist_head.data);
        SinglyLinkedListNode nextNodeList = llist_head.next;
        Assertions.assertEquals(13, nextNodeList.data);
        nextNodeList = nextNodeList.next;
        Assertions.assertEquals(1, nextNodeList.data);
        nextNodeList = nextNodeList.next;
        Assertions.assertEquals(7, nextNodeList.data);        
	}
}
