package com.example.datastructure.j_paths;

import com.example.datastructure.Node;

/**
 * ********************************************************************************
 * Maximum Path Sum in a Binary Tree
 * ********************************************************************************
 * Input:
 *     10
 *    /  \
 *   2    10
 *  / \    \
 * 20  1   -25
 *         /  \
 *        3    4
 * 
 * Output: 42			//20+2+10+10
 * 
 * ********************************************************************************
 */

public class J02_maxPathSum {
	/*
	 * For each node there can be four ways that the max path goes through the node.
	 * Keep trace of four paths and pick up the max one in the end.
	 * 	1. Node only
	 * 	2. Max path through Left Child + Node
	 * 	3. Max path through Right Child + Node
	 * 	4. Max path through Left Child + Node + Max path through Right Child
	 * 
	 * NOTE: root of every subtree need to return maximum path sum such that "at most one child of root is involved".
	 * that's why, sum1 returned from the method, not maxSum!!
	 */
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(10);
		root.left.left = new Node(20);
		root.left.right = new Node(1);
		root.right.right = new Node(-25);
		root.right.right.left = new Node(3);
		root.right.right.right = new Node(4);
		
		findMax(root);
		System.out.println("maximum path sum is "+maxSum);
	}
	
	
	private static int maxSum = Integer.MIN_VALUE;
	
	
	private static int findMax(Node node) {
		if (node == null)
			return 0;

		int lsum = findMax(node.left);
		int rsum = findMax(node.right);

		int max1 = Math.max(Math.max(lsum,rsum)+node.data, node.data);
		int max2 = Math.max(max1, lsum+rsum+node.data);
		maxSum = Math.max(maxSum, max2);
		
		return max1;
	}

}
