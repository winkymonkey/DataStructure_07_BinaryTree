package com.example.datastructure;


public class TreeUtil {
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		   1
	 *        / \
	 *       2   3
	 * *********************************
	 */
	public static Node createNewTree1() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
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
	public static Node createNewTree2() {
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
	 * 		      1
	 *        /      \
	 *      2          3
	 *    /   \      /   \
	 *   4    5     6     7
	 *    \  / \   / \   /
	 *    9 10 11 12 13 14
	 * *********************************
	 */
	public static Node createNewTree3() {
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
	 * 		  1
	 *      /   \
	 *     2     3
	 *    /       \
	 *   4         7
	 *  /           \
	 * 8            15
	 * *********************************
	 */
	public static Node createNewTree4() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		
		root.right.right.right = new Node(15);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		 1
	 *      /
	 *     2
	 *    /
	 *   4
	 *  /
	 * 8
	 * *********************************
	 */
	public static Node createNewTree5() {
		Node root = new Node(1);
		root.left = new Node(2);
		
		root.left.left = new Node(4);
		
		root.left.left.left = new Node(8);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		   1
	 *          \
	 *           3
	 *            \
	 *             7
	 *              \
	 *              15
	 * *********************************
	 */
	public static Node createNewTree6() {
		Node root = new Node(1);
		root.right = new Node(3);
		
		root.right.right = new Node(7);
		
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
	public static Node createNewTree7() {
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
	public static Node createNewTree8() {
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
	public static Node createNewTree9() {
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
