package com.example.datastructure.d_traversal_BFS_misc;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructure.Node;

/**
 * ************************************************************************
 * Connect nodes at same level
 * ************************************************************************
 * Write a function to connect all the adjacent nodes at the same level in a binary tree.
 * 
 * Input:
 *        1
 *       / \
 *      2   3
 *     / \   \
 *    4   5   6
 * 
 * Output:
 *        1-->NULL
 *       / \
 *      2-->3-->NULL
 *     / \   \
 *    4-->5-->6-->NULL
 * 
 * ************************************************************************
 */

public class D03_connectNodesAtSameLevel {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		root = connect(root);
		System.out.println(root);
	}
	
	
	private static Node connect(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int n = queue.size();
			
			for (int i=1; i<=n; i++) {
				Node polled = queue.poll();
				if (i!=n)							//non-ending nodes at a level
					polled.next = queue.peek();
				else								//ending node at a level
					polled.next = null;
				
				if (polled.left != null)
					queue.add(polled.left);
				
				if (polled.right != null)
					queue.add(polled.right);
				
			}
		}
		return root;
	}
	
}
