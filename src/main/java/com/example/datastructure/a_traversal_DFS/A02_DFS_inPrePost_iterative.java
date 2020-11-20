package com.example.datastructure.a_traversal_DFS;

import java.util.Stack;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;


public class A02_DFS_inPrePost_iterative {

	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA1();
		
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
			System.out.print(popped.data + " ");
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
			Node popped = stack.pop();
			System.out.print(popped.data + " ");
			
			if (popped.right != null)
				stack.push(popped.right);
			
			if (popped.left != null)
				stack.push(popped.left);
		}
	}
	
	
	public static void postOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		Stack<Node> output = new Stack<>();

		while (!stack.isEmpty()) {
			Node popped = stack.pop();
			output.push(popped);
			
			if (popped.left != null)
				stack.push(popped.left);
			
			if (popped.right != null)
				stack.push(popped.right);
		}
		
		while (!output.isEmpty()) {
			System.out.print(output.pop().data + " ");
		}
	}
	
}
