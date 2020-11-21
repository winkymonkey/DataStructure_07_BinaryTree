package com.example.datastructure.d_traversal_BFS;

import com.example.datastructure.Node;

/**
 * *****************************************************************************
 * Reverse alternate levels of a perfect binary tree
 * *****************************************************************************
 *            1
 *        /       \
 *      2           3
 *    /   \       /   \
 *   4     5     6     7
 *  / \   / \   / \   / \
 * 8   9 10 11 12 13 14 15
 * 
 * 
 * Output:
 *            1
 *        /       \
 *      3           2
 *    /   \       /   \
 *   4     5     6     7
 *  / \   / \   / \   / \
 * 15 14 13 12 11 10 9   8
 * 
 * *****************************************************************************
 */

public class D04_BFS_reverseAlternateLevels {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);
		
		reverse(root.left, root.right, 0);
		System.out.println("");
	}
	
	
	private static void reverse(Node node1, Node node2, int level) {
		if (node1 == null || node2 == null)
			return;
		
		if (level%2 == 0) {
			int temp = node1.data;
			node1.data = node2.data;
			node2.data = temp;
		}
		
		reverse(node1.left, node2.right, level+1);
		reverse(node1.right, node2.left, level+1);
	}
	
}
