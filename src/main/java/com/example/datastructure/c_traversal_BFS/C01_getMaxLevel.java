package com.example.datastructure.c_traversal_BFS;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * ********************************************************************************
 * Find the maximum level of a binary tree
 * ********************************************************************************
 */

public class C01_getMaxLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int maxLevel = getMaxLevel(root);
		System.out.println(maxLevel);
	}
	
	
	private static int getMaxLevel(Node node) {
		if (node == null)
			return 0;
		else {
			int leftLevel = getMaxLevel(node.left);
			int rightLevel = getMaxLevel(node.right);
			
			if (leftLevel > rightLevel)
				return leftLevel+1;
			else
				return rightLevel+1;
		}
	}
	
}
