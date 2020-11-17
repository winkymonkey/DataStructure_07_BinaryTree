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
		int targetLevel = 3;
		printThisLevel(root, targetLevel);
	}
	
	
	private static void printThisLevel(Node node, int level) {
		if (node == null)										//when some node is missing from hierarchy OR it's leaf node
			return;
		
		if (level == 1) {										//when it's desired level
			System.out.print(node.data + " ");
		}
		else if (level > 1) {									//when we didn't reach that level yet
			printThisLevel(node.right, level-1);
			printThisLevel(node.left, level-1);
		}
	}
	
}
