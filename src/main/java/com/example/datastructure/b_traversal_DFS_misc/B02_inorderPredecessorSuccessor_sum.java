package com.example.datastructure.b_traversal_DFS_misc;

/**
 * *********************************************************************************************
 * Replace each node in binary tree with the sum of its InOrder predecessor and successor
 * *********************************************************************************************
 * Input:
 *        1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7			
 * 
 * Output:
 *       11
 *      /  \
 *     9    13
 *    / \   / \
 *   2   3 4   3
 * 
 * For 1: InOrder predecessor=5, successor=6, Sum=11
 * For 2: InOrder predecessor=4, successor=5, Sum=9
 * For 4: InOrder predecessor=0, successor=2, Sum=2
 * 
 * *********************************************************************************************
 */

public class B02_inorderPredecessorSuccessor_sum {
	/*
	 * A[0] = 0;
	 * A[1...(n-1)] = tree nodes in InOrder sequence
	 * A[n] = 0;
	 * 
	 * static i = 1;
	 * 
	 * Perform InOrder traversal
	 * while traversing {
	 *    replace node's value with A[i-1] + A[i+1];
	 *    i++;
	 * }
	 * 
	 */
}
