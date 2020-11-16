package com.example.datastructure.b_traversal_DFS_misc;

/**
 * *********************************************************************************************
 * Replace each node in binary tree with the sum of its InOrder predecessor and successor
 * *********************************************************************************************
 * I/P:
 *        1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7			
 *   						For 2: InOrder predecessor=4, InOrder successor=5, Sum=4+5=9
 *   						For 4: InOrder predecessor=0, InOrder successor=2, Sum=0+2=2
 *   						.....
 *   						A[] = [0 4 2 5 1 6 3 7 0]
 * O/P:
 *       11
 *      /  \
 *     9    13
 *    / \   / \
 *   2   3 4   3
 * 
 * *********************************************************************************************
 */

public class B02_sumOfInorderPredecessorSuccessor {
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
