package com.hackerhank.problems.implementations.datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hackerhank.problems.datastructures.linkedlist.LinkedList;
import com.hackerhank.problems.datastructures.linkedlist.SinglyLinkedList;
import com.hackerhank.problems.datastructures.linkedlist.SinglyLinkedListNode;

public class LinkedListTest {

	private SinglyLinkedList linkedList;
	
	@Test
	public void insertNodeAtTailTest() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		int[] elements = {1, 2, 3, 4};
		for (int i = 0; i < elements.length; i++) {
			SinglyLinkedListNode node = LinkedList.insertNodeAtTail(singlyLinkedList.head, elements[i]);
			singlyLinkedList.head = node;
		}
		Assertions.assertEquals(elements[0], linkedList.head.data);
	}
}
