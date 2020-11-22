package com.example.datastructure.j_checking;

import com.example.datastructure.Node;

/**
 * *****************************************************************************
 * Check if a binary tree is subtree of another binary tree
 * *****************************************************************************
 * Tree1:
 *     26
 *    /  \
 *   10   3
 *  /  \   \
 * 4    6   3
 *  \
 *  30
 * 
 * 
 * Tree2:
 *   10
 *  /  \
 * 4    6
 *  \
 *  30
 * 
 * *****************************************************************************
 */

public class J10_check_subtreeOfAnotherTree {

	public static void main(String args[]) {
		Node root1 = new Node(26);
		root1.right = new Node(3);
		root1.right.right = new Node(3);
		root1.left = new Node(10);
		root1.left.left = new Node(4);
		root1.left.left.right = new Node(30);
		root1.left.right = new Node(6);

		Node root2 = new Node(10);
		root2.right = new Node(6);
		root2.left = new Node(4);
		root2.left.right = new Node(30);

		if (isSubtree(root1, root2))
			System.out.println("Tree2 is subtree of Tree1");
		else
			System.out.println("Tree2 is not a subtree of Tree1");
	}
	
	
	private static boolean isSubtree(Node T, Node S) {
		if (S == null)
			return true;

		if (T == null)
			return false;

		if (areIdentical(T, S))
			return true;

		return isSubtree(T.left, S) || isSubtree(T.right, S);
	}
	
	
	private static boolean areIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data && areIdentical(root1.left, root2.left)
				&& areIdentical(root1.right, root2.right));
	}

}
