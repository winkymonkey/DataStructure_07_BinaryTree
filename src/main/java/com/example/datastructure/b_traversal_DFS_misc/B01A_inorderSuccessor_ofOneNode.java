package com.example.datastructure.b_traversal_DFS_misc;

/**
 * *****************************************************************************
 * InOrder Successor of a node in Binary Tree
 * *****************************************************************************
 * InOrder Successor of a node is the next node in InOrder traversal.
 * InOrder Successor is NULL for the last node in InOrder traversal.
 * 
 * Example:
 * 		1
 *     / \
 *    2   3
 *   / \   \
 *  4   5   6
 * 
 * InOrder successor of node 3 is 6
 * InOrder successor of node 4 is 2
 * InOrder successor of node 5 is 1
 * InOrder successor of node 6 is NULL
 * 
 * *****************************************************************************
 */

public class B01A_inorderSuccessor_ofOneNode {
	/*
	 * To find the InOrder Successor of a given node 'X', we need to take care of 3 cases.
	 * 
	 * ----------------------------------------------------------------
	 * CASE-1:	IF [X.right != null]		//successor of 1 or 2 or 3
	 * ----------------------------------------------------------------
	 * Recursively find the leftmost node in the right subtree rooted at X.
	 * //successor is the leftmost Node
	 * 
	 * 
	 * 
	 * -----------------------------------------------------------------------------------------------------------
	 * CASE-2:	IF [X.right == null] and [X is NOT the rightMost Node of entire tree]		//successor of 4 or 5
	 * -----------------------------------------------------------------------------------------------------------
	 * Recursively find 'X' in the entire tree
	 * After finding 'X', recursion will backtrack to the root
	 * Each recursive call will return the current root itself to the calling function
	 * Store this in a temporary node TEMP
	 * 
	 * If current root's left == TEMP
	 * 		//successor is the current node
	 * 
	 * 
	 * 
	 * --------------------------------------------------------------------------------------------------
	 * CASE-3:	IF [X.right == null] and [X is the rightMost Node of entire tree]		//successor of 6
	 * --------------------------------------------------------------------------------------------------
	 * //successor is NULL
	 * 
	 */
}
