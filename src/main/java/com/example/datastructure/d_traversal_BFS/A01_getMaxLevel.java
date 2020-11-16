package com.example.datastructure.d_traversal_BFS;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;


public class A01_getMaxLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int maxLevel = getMaxLevel(root);
		System.out.println(maxLevel);
	}
	
	
	private static int getMaxLevel(Node node) {
		if(node == null)
			return 0;
		else {
			int leftLevel = getMaxLevel(node.left);
			int rightLevel = getMaxLevel(node.right);
			
			if(leftLevel > rightLevel)
				return leftLevel+1;
			else
				return rightLevel+1;
		}
	}
	
}
