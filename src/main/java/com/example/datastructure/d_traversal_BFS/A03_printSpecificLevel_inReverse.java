package com.example.datastructure.d_traversal_BFS;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;


public class A03_printSpecificLevel_inReverse {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 4;
		printTargetLevelInReverse(root, targetLevel);
	}
	
	
	private static void printTargetLevelInReverse(Node node, int level) {
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.key + " ");
		
		else if(node!=null && level > 1) {
			printTargetLevelInReverse(node.right, level-1);
			printTargetLevelInReverse(node.left, level-1);
		}
	}
	
}
