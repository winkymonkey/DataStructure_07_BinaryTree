package com.example.datastructure.d_traversal_BFS;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;


public class A02_printSpecificLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 3;
		printThisLevel(root, targetLevel);
	}
	
	
	private static void printThisLevel(Node node, int level) {
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.key + " ");
		
		else if(node!=null && level > 1) {
			printThisLevel(node.left, level-1);
			printThisLevel(node.right, level-1);
		}
	}
	
}
