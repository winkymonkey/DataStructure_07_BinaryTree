package com.example.datastructure.e_traversal_misc;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * *****************************************************************************
 * Boundary Traversal of binary tree
 * *****************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *   /   \    \
 *  4     5    7
 *   \   / \   /
 *    9 10 11 12
 * 
 * 1 2 4 9 10 11 12 7 3
 * 
 * *****************************************************************************
 */

public class E04_boundaryTraversal {
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA7();
		if(root != null) {
			System.out.print(root.data + " ");
			
			printBoundaryLeft(root.left);
			printLeaves(root.left);
			printLeaves(root.right);
			printBoundaryRight(root.right);
		}
	}
	
	
	//to ensure top down order, first print the node, then call itself for subtree
	private static void printBoundaryLeft(Node node) {
		if (node == null)
			return;

		if (node.left != null) {					//nodes in left edge that has left child
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		}
		else if (node.right != null) {				//nodes in left edge that has only right child
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
		else {										//Leaf node (do nothing to avoid duplicates in output)
			
		}
	}
	
	
	private static void printLeaves(Node node) {
		if (node == null)
			return;
		
		if (node.left == null && node.right == null) 	// leaf node
			System.out.print(node.data + " ");
		
		printLeaves(node.left);
		printLeaves(node.right);
	}
	
	
	//to ensure bottom up order, first call itself for subtree, then print the node
	private static void printBoundaryRight(Node node) {
		if (node == null)
			return;
		
		if (node.right != null) {					//nodes in right edge that has right child
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		}
		else if (node.left != null) {				//nodes in right edge that has only left child
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
		else {
													// Leaf node (do nothing to avoid duplicates in output)
		}
	}
	
}
