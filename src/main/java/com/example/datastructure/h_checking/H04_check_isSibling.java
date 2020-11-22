package com.example.datastructure.h_checking;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * ******************************************************************************************
 * Check if two nodes in a Binary Tree are siblings
 * ******************************************************************************************
 * Sibling Nodes -- if two nodes are at same level and have different parents
 * 
 * ******************************************************************************************
 * 		     1
 *        /      \
 *      2          3
 *    /   \       /  \
 *   4     5     6    7
 *    \   / \   / \   /
 *     8 9  10 11 12 13
 * 
 * isSiblings(4,6) = FALSE
 * isSiblings(6,7) = TRUE
 * 
 * ******************************************************************************************
 */

public class H04_check_isSibling {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		
		boolean isSibling = checkSiblings(root, 10, 11);
		System.out.println(isSibling);
	}
	
	
	private static boolean checkSiblings(Node node, int a, int b) {
		if (node == null || node.left==null || node.right==null)
			return false;
		
		if ((node.left.data==a && node.right.data==b) || (node.left.data==b && node.right.data==a))
			return true;
		
		return (checkSiblings(node.left, a, b) || checkSiblings(node.right, a, b));		
	}
	
}
