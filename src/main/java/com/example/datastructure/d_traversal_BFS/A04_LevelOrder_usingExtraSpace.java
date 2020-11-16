package com.example.datastructure.d_traversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;

/**
 * *****************************************************************************
 * Level Order Tree Traversal
 * *****************************************************************************
 */

public class A04_LevelOrder_usingExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		printBFS(queue);
	}
	
	
	private static void printBFS(Queue<Node> queue) {
		while(!queue.isEmpty()) {
			Node poppedNode = queue.poll();			//retrieves and removes the head (first element) of this list
			System.out.print(poppedNode.key + " ");
			
			if(poppedNode.left != null) {
				queue.add(poppedNode.left);
			}
		 	if(poppedNode.right != null) {
		 		queue.add(poppedNode.right);
		 	}
		 }
	}
	
}
