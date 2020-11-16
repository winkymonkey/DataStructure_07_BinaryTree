package com.example.datastructure.d_traversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * *****************************************************************************
 * Level Order Tree Traversal
 * *****************************************************************************
 */

public class D01_BFS_usingExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		printBFS(queue);
	}
	
	
	private static void printBFS(Queue<Node> queue) {
		while (!queue.isEmpty()) {
			Node node = queue.poll();				//Retrieves and removes the head of this queue
			System.out.print(node.data + " ");
			
			if (node.left != null)
				queue.add(node.left);
			
		 	if (node.right != null)
		 		queue.add(node.right);
		 	
		 }
	}
	
}
