package com.example.datastructure.b_traversal_DFS_misc;

import com.example.datastructure.Node;

/**
 * ***************************************************************
 * 		1
 *     / \
 *    2   3
 *   / \   \
 *  4   5   6
 *
 * ***************************************************************
 */

public class B01B_inorderSuccessor_ofOneNode {
	
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		findInorderSuccesor(root, root);				// case 1 (X = 1)
		findInorderSuccesor(root, root.left);			// case 1 (X = 2)
		findInorderSuccesor(root, root.right);			// case 1 (X = 3)

		findInorderSuccesor(root, root.left.left);		// case 2 (X = 4)
		findInorderSuccesor(root, root.left.right);		// case 2 (X = 5)

		findInorderSuccesor(root, root.right.right);	// case 3 (X = 6)
		
	}
	
	
	private static void findInorderSuccesor(Node root, Node X) {
		if (X.right != null) {													// Case1: If right child is not null
			Node node = leftMostNode(X.right);
			System.out.println("Inorder Successor of " + X.data + " is " + node.data);
		}
		
		if (X.right == null && rightMostNode(root)!=X)							// Case2: If right child is null
			find(root, X);
		
		if (X.right == null && rightMostNode(root)==X)							// Case3: If right child is null and X is the right most node
			System.out.println("Inorder Successor of " + X.data + " is NULL");
	
	}
	
	
	private static Node leftMostNode(Node node) {
		while (node != null && node.left != null)
			node = node.left;
		return node;
	}
	private static Node rightMostNode(Node node) {
		while (node != null && node.right != null)
			node = node.right;
		return node;
	}
	
	
	private static Node temp;
	
	private static Node find(Node root, Node X) {
		if (root == null)
			return null;
		
		if (root == X)
			return root;
		
		if ((temp = find(root.left, X)) != null || (temp = find(root.right, X)) != null) {
			if (root.left == temp) {
				System.out.println("Inorder Successor of " + X.data + " is " + root.data);
				return null;
			}
			return root;
		}
		return null;
	}
	
}
