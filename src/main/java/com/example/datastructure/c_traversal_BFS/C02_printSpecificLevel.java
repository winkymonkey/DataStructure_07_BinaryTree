package com.example.datastructure.c_traversal_BFS;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * ********************************************************************************
 * Print a specific level in a binary tree
 * ********************************************************************************
 */

public class C02_printSpecificLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		int targetLevel = 3;
		printThisLevel(root, targetLevel);
	}
	
	
	private static void printThisLevel(Node node, int level) {
		if (node == null)
			return;
		
		if (level == 1) {										//when it's desired level
			System.out.print(node.data + " ");
		}
		else if (level > 1) {									//when we didn't reach that level yet
			printThisLevel(node.left, level-1);
			printThisLevel(node.right, level-1);
		}
	}
	
	
	
//	private static void printThisLevel(Node node, int currentLevel, int targetLevel) {
//		if (node == null)
//			return;
//		
//		if (currentLevel == targetLevel)
//			System.out.print(node.data + " ");
//		else {
//			printThisLevel(node.left, currentLevel+1, targetLevel);
//			printThisLevel(node.right, currentLevel+1, targetLevel);
//		}
//	}
	
}
