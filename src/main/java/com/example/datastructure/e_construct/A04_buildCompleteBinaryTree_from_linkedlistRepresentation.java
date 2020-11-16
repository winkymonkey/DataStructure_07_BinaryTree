package com.example.datastructure.e_construct;

/**
 * *****************************************************************************
 * Construct Complete Binary Tree from its Linked List Representation
 * *****************************************************************************
 */
public class A04_buildCompleteBinaryTree_from_linkedlistRepresentation {
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
	 * 3. Until we reach the end of the list, do the following.
	 * ���a. Dequeue one node from the queue. This is the current parent.
	 * ���b. Traverse two nodes in the list, add them as children of the current parent.
	 * ���c. Enqueue the two nodes into the queue.
	 * 
	 */
}
