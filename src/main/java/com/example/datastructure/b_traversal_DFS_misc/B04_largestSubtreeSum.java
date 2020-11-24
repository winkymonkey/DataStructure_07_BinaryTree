package com.example.datastructure.b_traversal_DFS_misc;

/**
 * *****************************************************************************
 * Find largest subtree sum in a tree
 * *****************************************************************************
 * Given a binary tree, task is to find subtree with maximum sum in tree.
 * *****************************************************************************
 * Input :       
 *      1
 *    /   \
 *   2      3
 *  / \    / \
 * 4   5  6   7
 * 
 * Output: 28		//As all the tree elements are positive, the "largest subtree sum" is the sum of all elements.
 * 
 * 
 * Input :       
 *      1
 *    /   \
 *  -2     3
 *  / \   /  \
 * 4   5 -6   2
 * 
 * Output : 7		//(subtree consisting of -2,4,5 is sum of 7) OR (entire tree has sum of 7) 
 * 
 * *****************************************************************************
 */

public class B04_largestSubtreeSum {
	/*
	 * Do PreOrder traversal (root-left-right) 
	 * and in each recursive call, calculate the sum of current root, sum of left subtree, sum of right subtree
	 * and keep maintaining the max so far
	 * 
	 */
}
