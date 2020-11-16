package com.example.datastructure.c_traversal_BFS;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;


public class C03_printSpecificLevel_inReverse {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 4;
		printTargetLevelInReverse(root, targetLevel);
	}
	
	
	private static void printTargetLevelInReverse(Node node, int level) {
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.data + " ");
		
		else if(node!=null && level > 1) {
			printTargetLevelInReverse(node.right, level-1);
			printTargetLevelInReverse(node.left, level-1);
		}
	}
	
}
