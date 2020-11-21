package com.example.datastructure.d_traversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * *****************************************************************************
 * Print BFS traversal sequence
 * *****************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *    8      9
 * 
 * BFS:   1 2 3 4 5 6 7 8 9
 * 
 * ******************************************************************************************
 */

public class D01_BFS_usingExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		printBFS(root);
	}
	
	
	private static void printBFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node polled = queue.poll();				//Retrieves and removes the head of this queue
			System.out.print(polled.data + " ");
			
			if (polled.left != null)
				queue.add(polled.left);
			
		 	if (polled.right != null)
		 		queue.add(polled.right);
		 	
		 }
	}
	
}
