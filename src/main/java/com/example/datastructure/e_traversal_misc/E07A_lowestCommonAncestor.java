package com.example.datastructure.e_traversal_misc;

/**
 * ************************************************************************************************************
 * Given a binary tree and two values say n1 and n2, write a program to find the least common ancestor.
 * ************************************************************************************************************
 * The lowest common ancestor between two nodes n1 and n2 is defined 
 * as the lowest node in the tree that has both n1 and n2 as descendants 
 * (where we allow a node to be a descendant of itself).
 * 
 * The LCA of n1 and n2 in the tree is the shared ancestor of n1 and n2 that is located farthest from the root.
 * 
 * Computation of lowest common ancestors may be useful as part of a procedure for determining the distance between pairs of nodes in a tree:
 * the distance from n1 to n2 can be computed as the distance from the root to n1,
 * plus the distance from the root to n2
 * minus twice the distance from the root to their LCA
 * 
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *  /           \
 * 8             9
 * 
 * LCA(4, 5) = 2
 * LCA(4, 6) = 1
 * LCA(3, 4) = 1
 * LCA(2, 4) = 2
 * 
 * ************************************************************************************************************
 */

public class E07A_lowestCommonAncestor {
	/*
	 * --------------------
	 * ---NAIVE SOLUTION---
	 * --------------------
	 * Find a path from the root to n1 and store it in a array.
	 * Find a path from the root to n2 and store it in another array.  
	 * Traverse both paths till the values in arrays are the same. Return the common element just before the mismatch.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * ----------------------
	 * ---SINGLE TRAVERSAL---
	 * ----------------------
	 * Traverse the tree starting from the root.
	 * If any of the given keys n1 or n2 matches with the root, then the root is LCA.
	 * If the root doesn’t match with any of the keys, we recur for the left and right subtree.
	 *  - The node which has one key present in its left subtree and the another key in the right subtree is the LCA.
	 *  - If both keys lie in the left subtree, then the left subtree has LCA also, otherwise, LCA lies in the right subtree.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
