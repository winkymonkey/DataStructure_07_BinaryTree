package com.example.datastructure.c_traversal_DFS_misc;

/**
 * *****************************************************************************
 * Inorder Successor of a node in Binary Tree
 * *****************************************************************************
 */
public class A01_inorderSuccessor_ofOneNode {
	/*
	 * Find Inorder Successor of a given node 'X'.
	 * We need to take care of 3 cases.
	 *        1
	 *       / \
	 *      2   3
	 *     / \   \
	 *    4   5   6
	 * -------------------------------------------------------------------------
	 * CASE-1: [X.right != null]
	 * Inorder successor of 'X' is the leftmost node in its right subtree.
	 * -------------------------------------------------------------------------
	 * CASE-2: [X.right == null]
	 * Start traversing from ROOT to find 'X' recursively.
	 * 	  If root == X, stop recursion
	 * 	  Otherwise find X recursively for left and right subtrees
	 * Now after finding the node X, recursion will back�track to the root.
	 * Every recursive call will return the node itself to the calling function.
	 * We will store this in a temporary node say TEMP.
	 * Check whether root.left = TEMP, if not , keep going up
	 * 
	 * invoke findInCase2(ROOT, X);
	 * 
	 * void findInCase2(node, X){
	 * 		if((node == X) || (TEMP = findInCase2(node.left, X)) ||  (TEMP = findInCase2(node.right, X))){
	 * 			if(node.left == TEMP)
	 * 				//print node.data
	 * 		}
	 * }
	 * -------------------------------------------------------------------------
	 * CASE-3: [X is the right-most node]
	 * There will be no Inorder successor of this node.
	 * Inorder Successor of the rightmost node in a tree is NULL.
	 * -------------------------------------------------------------------------
	 * 
	 */
}
