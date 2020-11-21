package com.example.datastructure.e_traversal_misc;

import com.example.datastructure.Node;

/**
 * ******************************************************************************************
 * Binary Tree Longest Consecutive Sequence
 * ******************************************************************************************
 * Given a binary tree, find the length of the longest consecutive sequence path
 * The path refers to any sequence of nodes from some starting node to any node in node in the tree along the parent-child connections.
 * The longest consecutive path need to be from parent to child (cannot be the reverse)
 * 
 * ******************************************************************************************
 * Example:
 * 		  1
 *      /   \
 *     2     5
 *    / \   / \
 *   3  19 6   10
 *  /       \   \
 * 12        7   9
 *          /
 *         8
 * 
 * Output: 4			//the longest consecutive sequence path is 5->6->7->8 
 * 
 * ******************************************************************************************
 */

public class E06_longestConsecutiveSequence {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(5);
		
		root.left.left = new Node(3);
		root.left.right = new Node(19);
		
		root.right.left = new Node(6);
		root.right.right = new Node(10);
		
		root.left.left.left = new Node(12);
		
		root.right.left.right = new Node(7);
		
		root.right.right.right = new Node(9);
		
		root.right.left.right.left = new Node(8);
		
		findConSeq(root);
		
		System.out.println(maxLen);
	}
	
	
	private static int maxLen = 0;
	
	
	private static int findConSeq(Node root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		int leftLen = findConSeq(root.left);
		int rightLen = findConSeq(root.right);

		if (root.left != null && root.data == root.left.data - 1) {
			leftLen++;
			maxLen = Math.max(leftLen, rightLen);
			return leftLen;
		}
		else if (root.right != null && root.data == root.right.data - 1) {
			rightLen++;
			maxLen = Math.max(leftLen, rightLen);
			return rightLen;
		}
		else {
			return 1;
		}
	}
	
}
