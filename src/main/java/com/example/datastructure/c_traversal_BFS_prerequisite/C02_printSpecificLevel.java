package com.example.datastructure.c_traversal_BFS_prerequisite;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * ********************************************************************************
 * Print a specific level in a binary tree
 * ********************************************************************************
 */

public class C02_printSpecificLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 3;
		printThisLevel(root, targetLevel);
	}
	
	
	private static void printThisLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.data + " ");
		
		else if (node!=null && level > 1) {
			printThisLevel(node.left, level-1);
			printThisLevel(node.right, level-1);
		}
	}
	
}
