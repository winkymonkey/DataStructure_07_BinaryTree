package com.example.datastructure.f_construct;

import com.example.datastructure.Node;

/**
 * *****************************************************************************
 * Construct Tree from given InOrder and PreOrder traversals
 * *****************************************************************************
 */

public class F02_from_InorderPreorder_constructTree {
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int PRE[] = {1, 2, 7, 3, 4, 5};
	
	
	public static void main(String args[]) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int preStart = 0;
		Node root = buildTree(inStart, inEnd, preStart);
		System.out.println(root);
	}
	

	private static Node buildTree(int inStart, int inEnd, int preStart) {
		if (inStart > inEnd)
			return null;
		
		Node tNode = new Node(PRE[preStart]);

		if (inStart == inEnd)
			return tNode;

		int result = search(inStart, inEnd, tNode.data);
		
		tNode.left = buildTree(inStart, result-1, preStart+1);
		tNode.right = buildTree(result+1, inEnd, result+1);

		return tNode;
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inStart; k <= inEnd; k++)
			if (key == IN[k])
				return k;
		return 0;
	}

}