package com.example.datastructure.howtoapply.c_traversal_BFS;

import com.example.datastructure.core.Node;
import com.example.datastructure.core.TreeUtil;



public class A02_printSpecificLevel {
	private static A02_printSpecificLevel obj = new A02_printSpecificLevel();
	
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 3;
		obj.printThisLevel(root, targetLevel);
	}
	
	
	private void printThisLevel(Node node, int level) {
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
