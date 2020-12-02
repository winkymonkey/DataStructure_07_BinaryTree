package com.example.datastructure.c_traversal_BFS;

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
 * *****************************************************************************
 */

public class C04_BFS_usingExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		printBFS(root);
	}
	
	
	private static void printBFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node polled = queue.poll();
			System.out.print(polled.data + " ");
			
			if (polled.left != null)
				queue.add(polled.left);
			
		 	if (polled.right != null)
		 		queue.add(polled.right);
		 	
		 }
	}
	
	
	
//	private static void printBFS2(Node root) {
//		Queue<Node> queue = new LinkedList<Node>();
//		queue.add(root);
//		
//		while (!queue.isEmpty()) {
//			int n = queue.size();
//			
//			for (int i=1; i<=n; i++) {				// Traverse all nodes of current level
//				Node polled = queue.poll();
//				System.out.print(polled.data + " ");
//				
//				if (polled.left != null)
//					queue.add(polled.left);
//				
//			 	if (polled.right != null)
//			 		queue.add(polled.right);
//			 	
//			}
//		}
//	}
	
}
