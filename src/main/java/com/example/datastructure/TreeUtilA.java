package com.example.datastructure;


public class TreeUtilA {
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		  1
	 *      /   \
	 *     2     3
	 *    / \   / \
	 *   4   5 6   7
	 *  /           \
	 * 8            15
	 * *********************************
	 */
	public static Node createNewTreeA1() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		
		root.right.right.right = new Node(15);
		
		return root;
	}
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		  1
	 *      /   \
	 *     2     3
	 *    / \   / \
	 *   4   5 6   7
	 *    \       /
	 *    9      14
	 * *********************************
	 */
	public static Node createNewTreeA2() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.right = new Node(9);
		
		root.right.right.left = new Node(14);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		      1
	 *        /      \
	 *      2          3
	 *    /   \      /   \
	 *   4    5     6     7
	 *    \  / \   / \   /
	 *    9 10 11 12 13 14
	 * *********************************
	 */
	public static Node createNewTreeA3() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.right = new Node(9);
		
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		
		root.right.right.left = new Node(14);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		     1
	 *        /      \
	 *      2          3
	 *    /   \      /  \
	 *   4    5     6    7
	 *  / \  / \   / \   /\
	 * 8  9 10 11 12 13 14 15
	 * *********************************
	 */
	public static Node createNewTreeA4() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		   1
	 *      /     \
	 *     2       3
	 *   /   \      \
	 *  4     5      7
	 *   \   / \    /
	 *    9 10 11  12
	 * *********************************
	 */
	public static Node createNewTreeA5() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.right = new Node(7);
		
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		root.right.right.left = new Node(12);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		  1
	 *      /   \
	 *     2     3
	 *   /   \    \
	 *  4     5    7
	 *   \   / \
	 *    9 10 11
	 * *********************************
	 */
	public static Node createNewTreeA6() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.right = new Node(7);
		
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 *          1
	 *        /   \
	 *       2     3
	 *      / \   / \
	 *     4   5 6   7
	 *            \   \
	 *             8   9 
	 * *********************************
	 */
	public static Node createNewTreeA7() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.right.left.right = new Node(8);
		
		root.right.right.right = new Node(9);
		
		return root;
	}
	
}
