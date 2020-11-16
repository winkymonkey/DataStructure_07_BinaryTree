package com.example.datastructure.d_traversal_misc;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * *****************************************************************************
 * Boundary Traversal of binary tree
 * *****************************************************************************
 * I/P:
 * 		 1
 *     /   \
 *    2     3
 *   / \     \
 *  4   5     7
 *     / \
 *    10  11
 * 
 * O/P:
 * 1 2 3 10 11 7 3 1
 * 
 * *****************************************************************************
 */
public class A04_boundaryTraversal {
	
	public static void main(String args[]) {
		Node root = TreeUtil.createNewTree3();
		if(root != null) {
			System.out.print(root.data + " ");
			
			printBoundaryLeft(root.left);
			printLeaves(root.left);
			printLeaves(root.right);
			printBoundaryRight(root.right);
		}
	}
	
	
	/* To ensure top down order, first print this node & then call itself for left subtree */
	private static void printBoundaryLeft(Node node) {
		if(node == null)
			return;
		else {
			if(node.left != null) {
				System.out.print(node.data + " ");
				printBoundaryLeft(node.left);
			}
			else if(node.right != null) {
				System.out.print(node.data + " ");
				printBoundaryLeft(node.right);
			}
			else {
				//Leaf node
				//do nothing to avoid duplicates in output
			}
		}
	}
	
	
	private static void printLeaves(Node node) {
		if(node == null)
			return;
		else {
			if(node.left == null && node.right == null)		//leaf node
				System.out.print(node.data + " ");
			printLeaves(node.left);
			printLeaves(node.right);
		}
	}
	
	
	/* To ensure bottom up order, first call itself for right subtree & then print this node */
	private static void printBoundaryRight(Node node) {
		if(node == null)
			return;
		else {
			if(node.right != null) {
				printBoundaryRight(node.right);
				System.out.print(node.data + " ");
			}
			else if(node.left != null) {
				printBoundaryRight(node.left);
				System.out.print(node.data + " ");
			}
			else {
				//Leaf node
				//do nothing to avoid duplicates in output
			}
		}
	}
	
}
