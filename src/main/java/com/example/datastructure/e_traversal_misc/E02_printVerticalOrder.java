package com.example.datastructure.e_traversal_misc;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtil;

/**
 * *****************************************************************************
 * Print a Binary Tree in Vertical Order | Set 1
 * *****************************************************************************
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *            \   \
 *             8   9 
 * 
 * Vertical Traversal of binary tree :
 * 		4
 * 		2
 * 		1 5 6
 * 		3 8
 * 		7
 * 		9 
 * 
 * TIME --- O(n^2)
 * 
 * *****************************************************************************
 */

public class E02_printVerticalOrder {
	
	private static int MIN = 0;			//minimum horizontal distance from root
	private static int MAX = 0;			//maximum horizontal distance from root
	
	public static void main(String args[]) {
		Node root = TreeUtil.createNewTree7();
		findMinMaxDistance(root, 0);
		
		for (int line=MIN; line<=MAX; line++) {
			printVerticalLine(root, line, 0);
			System.out.println("");
		}
	}
	
	
	private static void findMinMaxDistance(Node node, int hd) { 	//hd = horizontal distance of current node from root
		if (node == null)
			return;
		
		MIN = (hd < MIN ? hd : MIN);
		MAX = (hd > MAX ? hd : MAX);
		
		findMinMaxDistance(node.left, hd-1);
		findMinMaxDistance(node.right, hd+1);
	}
	
	
	private static void printVerticalLine(Node node, int line, int hd) {	//hd = horizontal distance of current node from root
		if (node == null)
			return;
		
		if (hd == line)
			System.out.print(node.data + " ");
		
		printVerticalLine(node.left, line, hd-1);
		printVerticalLine(node.right, line, hd+1);
	}
	
}
