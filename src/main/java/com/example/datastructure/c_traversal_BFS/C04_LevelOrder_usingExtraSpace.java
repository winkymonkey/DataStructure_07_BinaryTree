package com.example.datastructure.c_traversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * *****************************************************************************
 * Level Order Tree Traversal
 * *****************************************************************************
 */

public class C04_LevelOrder_usingExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		printBFS(queue);
	}
	
	
	private static void printBFS(Queue<Node> queue) {
		while(!queue.isEmpty()) {
			Node poppedNode = queue.poll();			//retrieves and removes the head (first element) of this list
			System.out.print(poppedNode.data + " ");
			
			if(poppedNode.left != null) {
				queue.add(poppedNode.left);
			}
		 	if(poppedNode.right != null) {
		 		queue.add(poppedNode.right);
		 	}
		 }
	}
	
}
