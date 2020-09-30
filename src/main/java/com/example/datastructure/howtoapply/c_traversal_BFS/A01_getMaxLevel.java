package com.example.datastructure.howtoapply.c_traversal_BFS;

import com.example.datastructure.core.Node;
import com.example.datastructure.core.TreeUtil;



public class A01_getMaxLevel {
	private static A01_getMaxLevel obj = new A01_getMaxLevel();
	
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int maxLevel = obj.getMaxLevel(root);
		System.out.println(maxLevel);
	}
	
	
	private int getMaxLevel(Node node) {
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
