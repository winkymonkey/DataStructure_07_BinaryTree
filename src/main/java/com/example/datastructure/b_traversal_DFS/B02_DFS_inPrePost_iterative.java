package com.example.datastructure.b_traversal_DFS;

import java.util.Stack;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;


public class B02_DFS_inPrePost_iterative {

	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree5();
		
		System.out.print("InOrder:::");
		inorder(root);
		
		System.out.print("\nPreOrder::");
		preOrder(root);
		
		System.out.print("\nPostOrder:");
		postOrder(root);
	}
	
	
	private static void inorder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		Node current = root;

		while (!stack.isEmpty()) {
			while (current.left != null) {
				stack.push(current.left);
				current = current.left;
			}
			Node popped = stack.pop();
			System.out.print(popped.key + " ");
			if (popped.right != null) {
				stack.push(popped.right);
				current = popped.right;
			}
		}
	}
	
	
	public static void preOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node current = stack.pop();
			System.out.print(current.key + " ");
			
			if (current.right != null)
				stack.push(current.right);
			
			if (current.left != null)
				stack.push(current.left);
		}
	}
	
	
	public static void postOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		Stack<Node> output = new Stack<>();

		while (!stack.isEmpty()) {
			Node current = stack.pop();
			output.push(current);
			
			if (current.left != null)
				stack.push(current.left);
			
			if (current.right != null)
				stack.push(current.right);
		}
		
		while (!output.isEmpty()) {
			System.out.print(output.pop().key + " ");
		}
	}
	
}
