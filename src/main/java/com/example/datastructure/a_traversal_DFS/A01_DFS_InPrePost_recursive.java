package com.example.datastructure.a_traversal_DFS;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;


public class A01_DFS_InPrePost_recursive {

	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree5();

		System.out.print("InOrder:::");
		inOrder(root);

		System.out.print("\nPreOrder::");
		preOrder(root);

		System.out.print("\nPostOrder:");
		postOrder(root);
	}
	

	private static void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	
	
	private static void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	private static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}

}
