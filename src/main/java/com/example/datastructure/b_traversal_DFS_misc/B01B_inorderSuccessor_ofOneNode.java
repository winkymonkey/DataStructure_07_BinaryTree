package com.example.datastructure.b_traversal_DFS_misc;

import com.example.datastructure.Node;

/**
 * Example:
 * 		  1
 *      /    \
 *     2      3
 *   /   \     \
 *  4     5     6
 *
 */

public class B01B_inorderSuccessor_ofOneNode {
	
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);

		// Case 1
		inorderSuccesor(root, root.right);

		// case 2
		inorderSuccesor(root, root.left.left);
		inorderSuccesor(root, root.left.right);

		// case 3
		inorderSuccesor(root, root.right.right);

	}
	
	
	private static void inorderSuccesor(Node root, Node x) {
		if (x.right != null) {													// Case1: If right child is not null
			Node node = leftMostNode(x.right);
			System.out.println("Inorder Successor of " + x.data + " is " + node.data);
			
		}
		
		if (x.right == null && rightMostNode(root)!=x)							// Case2: If right child is null
			find(root, x);
		
		if (x.right == null && rightMostNode(root)==x)							// Case3: If right child is null and X is the right most node
			System.out.println("Inorder Successor of " + x.data + " is NULL");
	
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
	
	private static Node find(Node root, Node x) {
		if (root == null)
			return null;

		if (root == x || (temp = find(root.left, x)) != null || (temp = find(root.right, x)) != null) {
			if (temp!=null && root.left == temp) {
				System.out.println("Inorder Successor of " + x.data + " is " + root.data);
				return null;
			}
			return root;
		}
		return null;
	}

}
