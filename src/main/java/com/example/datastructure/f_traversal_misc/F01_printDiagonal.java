package com.example.datastructure.f_traversal_misc;

/**
 * *****************************************************************************
 * Diagonal Traversal of Binary Tree
 * *****************************************************************************
 * Given a Binary Tree, print all diagonal elements in a binary tree belonging to the same line.
 * 
 * *****************************************************************************
 *      8
 *    /   \
 *   3    10
 *  /    /  \
 * 1    6   14
 *     / \   /
 *    4   7 13
 * 
 * Output:
 * 		8 10 14
 * 		3 6 7 13
 * 		1 4
 * 
 * *****************************************************************************
 */

public class F01_printDiagonal {
	/*
	 * //take a Queue
	 * //add root to it
	 * 
	 * while (Queue is not empty) {
	 *    Node polled = Queue.poll()		//dequeue the first element of queue
	 *    
	 *    while (polled != null) {
	 *       print polled.data
	 *       if (polled.left != NULL)		//if it has any left child, enqueue that child in Queue
	 *          queue.add(polled.left);
	 *       
	 *       polled = polled.right;
	 *    }
	 * }
	 * 
	 */
}
