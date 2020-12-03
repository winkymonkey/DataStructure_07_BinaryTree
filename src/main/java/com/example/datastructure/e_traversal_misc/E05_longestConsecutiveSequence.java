package com.example.datastructure.e_traversal_misc;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

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

public class E05_longestConsecutiveSequence {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA8();
		
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

		if (root.left != null && root.left.data == root.data + 1) {			//a non-leaf node which forms sequence with left subtree
			leftLen++;
			maxLen = Math.max(leftLen, rightLen);
			return leftLen;
		}
		else if (root.right != null && root.right.data == root.data + 1) {	//a non-leaf node which forms sequence with right subtree
			rightLen++;
			maxLen = Math.max(leftLen, rightLen);
			return rightLen;
		}
		else {
			return 1;														//a non-leaf node which doesn't form any sequence
		}																	//neither with left subtree nor with right subtree
	}
	
}
