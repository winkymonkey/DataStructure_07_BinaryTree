package com.example.datastructure.howtoapply.a_traversal_DFS;

import java.util.Stack;

import com.example.datastructure.core.Node;
import com.example.datastructure.core.TreeUtil;



public class A02_DFS_inorder_withoutRecursion {
	private static A02_DFS_inorder_withoutRecursion obj = new A02_DFS_inorder_withoutRecursion();
	
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree();
		obj.doInorder(root);
	}
	
	
	private void doInorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Node temp = root;
		
		while(!stack.isEmpty()) {
			while(temp.left != null) {
				stack.push(temp.left);
				temp = temp.left;
			}
			Node popped = stack.pop();
			System.out.println(popped.key);
			if(popped.right != null) {
				stack.push(popped.right);
				temp = popped.right;
			}
		}
	}
}
