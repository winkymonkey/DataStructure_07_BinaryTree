package com.example.datastructure.core;

public class TreeUtil {
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		 1
	 *     /   \
	 *    2     3
	 *   / \   / \
	 *  4   5 6   7
	 * *********************************
	 */
	public static Node createNewTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		 1
	 *     /   \
	 *    2     3
	 *   /     / \
	 *  4     6   7
	 * *********************************
	 */
	public static Node createNewTree2() {
		Node root = new Node(1);
		root.left = new Node(2);
		
		root.right = new Node(3);
		root.left.left = new Node(4);
												/*root.left.right = new Node(5);*/
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		 1
	 *     /   \
	 *    2     3
	 *   / \     \
	 *  4   5     7
	 *     / \
	 *    10  11
	 * *********************************
	 */
	public static Node createNewTree3() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.right = new Node(7);
		
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		return root;
	}
}

