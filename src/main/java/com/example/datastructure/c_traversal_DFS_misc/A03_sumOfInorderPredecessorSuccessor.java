package com.example.datastructure.c_traversal_DFS_misc;

/**
 * *****************************************************************************
 * Replace each node in binary tree with the sum of its inorder predecessor and successor
 * *****************************************************************************
 * I/P:
 *        1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7			
 *   						For 2: Inorder predecessor=4, Inorder successor=5, Sum=4+5=9
 *   						For 4: Inorder predecessor=0, Inorder successor=2, Sum=0+2=2
 *   						.....
 *   						A[] = [0 4 2 5 1 6 3 7 0]
 * O/P:
 *       11
 *      /  \
 *     9    13
 *    / \   / \
 *   2   3 4   3
 * 
 * *****************************************************************************
 */
public class A03_sumOfInorderPredecessorSuccessor {
	/*
	 * A[0] = 0;
	 * A[1...(n-1)] = tree nodes in inorder sequence
	 * A[n] = 0;
	 * 
	 * static i = 1;
	 * Perform inorder traversal
	 * While traversing {
	 * 	replace node�s value with A[i-1] + A[i+1];
	 *  i++;
	 * }
	 * 
	 */
}
