package com.example.datastructure.j_paths;

import com.example.datastructure.Node;

/**
 * **********************************************************************
 * Given a binary tree, print all root-to-leaf paths
 * **********************************************************************
 * Input:
 *     10
 *    /  \
 *   8    2
 *  / \   /
 * 3   5 2
 *    /
 *   7
 * 
 * Output:
 * 		10 –> 8 –> 3
 * 		10 –> 8 –> 5
 * 		10 –> 2 –> 2
 * **********************************************************************
 */

public class J01_printAllRootToLeafPaths {
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		
		root.right.left = new Node(2);
		
		root.left.right.left = new Node(7);

		int path[] = new int[1000];
		findPaths(root, path, 0);
	}
	
	
	private static void findPaths(Node root, int path[], int pathLen) {
		if (root == null)
			return;

		path[pathLen] = root.data;
		pathLen++;	

		if (root.left == null && root.right == null) {
			print(path, pathLen);
		}
		else {
			findPaths(root.left, path, pathLen);
			findPaths(root.right, path, pathLen);
		}
	}
	
	
	private static void print(int path[], int pathLen) {
		for (int i=0; i<pathLen; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println("");
	}

}
