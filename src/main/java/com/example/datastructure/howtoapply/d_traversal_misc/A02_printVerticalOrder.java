package com.example.datastructure.howtoapply.d_traversal_misc;

import com.example.datastructure.core.Node;
import com.example.datastructure.core.TreeUtil;

class Limit {
	int MAX, MIN;
}

/**
 * *****************************************************************************
 * Print a Binary Tree in Vertical Order | Set 1
 * *****************************************************************************
 * I/P: 	1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *            \   \
 *             8   9 
 * 
 * O/P:	
 * 4
 * 2
 * 1 5 6
 * 3 8
 * 7
 * 9 
 * 
 * Note: hd means horizontal distance of a node w.r.t root
 * 
 * *****************************************************************************
 */
class A02_printVerticalOrder {
	private static A02_printVerticalOrder obj = new A02_printVerticalOrder();
	private static Limit limit = new Limit();
	
	
	public static void main(String args[]) {
		Node root = TreeUtil.createNewTree2();
		obj.findMinMaxDistance(root, 0);
		
		for(int line=limit.MIN; line<=limit.MAX; line++) {
			obj.printVerticalLine(root, line, 0);
			System.out.println("");
		}
	}
	
	
	void findMinMaxDistance(Node node, int hd) {
		if(node == null)
			return;
		limit.MIN = (hd<limit.MIN ? hd : limit.MIN);
		limit.MAX = (hd>limit.MAX ? hd : limit.MAX);
		findMinMaxDistance(node.left, hd-1);
		findMinMaxDistance(node.right, hd+1);
	}
	
	
	void printVerticalLine(Node node, int line, int hd) {
		if(node == null)
			return;
		if(hd == line)
			System.out.print(node.key + " ");
		printVerticalLine(node.left, line, hd-1);
		printVerticalLine(node.right, line, hd+1);
	}
}
