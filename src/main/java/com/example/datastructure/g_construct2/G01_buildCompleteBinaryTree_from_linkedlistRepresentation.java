package com.example.datastructure.g_construct2;

/**
 * *****************************************************************************
 * Construct Complete Binary Tree from its Linked List Representation
 * *****************************************************************************
 * A complete binary tree can be represented in an array in the following approach.
 * If root node is stored at index i, its left, and right children are stored at indices 2i+1, 2i+2 respectively.
 * 
 * *****************************************************************************
 */

public class G01_buildCompleteBinaryTree_from_linkedlistRepresentation {
	/*
	 * Linked List Representation -- 10->12->15->25->30->36
	 * 
	 * Tree Representation
	 * 			10
	 *         /   \
	 *       12     15
	 *      /  \    /  \
	 *     25  30  36
	 * ....
	 * 
	 * 
	 * 1. Create an empty queue.
	 * 2. Make the first node of the list as root, and enqueue it to the queue.
	 * 3. Until we reach the end of the list, do the below:
	 * 		a. Dequeue one node from the queue which is the current root.
	 * 		b. Traverse two nodes in the list, add them as children of the current parent.
	 * 		c. Enqueue the two nodes into the queue.
	 * 
	 */
}
