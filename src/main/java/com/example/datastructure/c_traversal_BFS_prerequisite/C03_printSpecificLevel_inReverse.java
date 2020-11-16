package com.example.datastructure.c_traversal_BFS_prerequisite;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * ********************************************************************************
 * Print a specific level in a binary tree in reverse
 * ********************************************************************************
 */

public class C03_printSpecificLevel_inReverse {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 4;
		printThisLevelInReverse(root, targetLevel);
	}
	
	
	private static void printThisLevelInReverse(Node node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.data + " ");
		
		else if (node!=null && level > 1) {
			printThisLevelInReverse(node.right, level-1);
			printThisLevelInReverse(node.left, level-1);
		}
	}
	
}
