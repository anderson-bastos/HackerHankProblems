package com.hackerhank.problems.datastructures.tree;

public class BinarySearchTree {

	private BinarySearchTree() {
		throw new IllegalStateException("Utility class");
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if (root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
    }
	
	public static void postOrder(Node root) {
		if (root == null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
    }
}
