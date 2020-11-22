package com.example.datastructure.h_checking;

/**
 * *****************************************************************************
 * Check sum of Covered and Uncovered nodes of Binary Tree
 * *****************************************************************************
 * In a binary tree, a node is called Uncovered if it appears either on left boundary or right boundary.
 * Rest of the nodes are called covered.
 * 
 * *****************************************************************************
 *           9
 *         /   \
 *        4     17
 *       / \      \
 *      3   6      22
 *         / \     /
 *        5   7   20
 * 
 * Covered Nodes ---- 6,5,7
 * Uncovered Nodes -- 9,4,3,17,22,20
 * 
 * *****************************************************************************
 */

public class H03_check_sumOfCoveredAndUncoveredNodes {
	/*
	 * THIS PROBLEM IS RELATED TO BOUNDARY TRAVERSAL
	 * 
	 * TRAVERSE LEFT BOUNDARY (sum_left)
	 * --start from root, keep going to left until left child is available.
	 * --if no left child, go to right child & again follow same procedure until you reach a leaf node.
	 * --in each step update the sum by adding the value of the currently traversed node.
	 * 
	 * TRAVERSE RIGHT BOUNDARY (sum_right)
	 * --start from root, keep going to left until right child is available.
	 * --if no right child, go to left child & again follow same procedure until you reach a leaf node.
	 * --in each step update the sum by adding the value of the currently traversed node.
	 * 
	 * TRAVERSE ENTIRE TREE (sum_all)
	 * --traverse full tree and calculate the sum of all nodes.
	 * 
	 * 
	 * sum_uncovered = sum_left + sum_right
	 * sum_covered = sum_all - sum_uncovered
	 * 
	 * check if "sum_covered" is equals to "sum_uncovered"
	 * 
	 */
}
