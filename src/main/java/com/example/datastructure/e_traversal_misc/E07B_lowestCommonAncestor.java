package com.example.datastructure.e_traversal_misc;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * ************************************************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *  /           \
 * 8             9
 * 
 * LCA(4, 5) = 2
 * LCA(4, 6) = 1
 * LCA(3, 4) = 1
 * LCA(2, 4) = 2
 * 
 * ************************************************************************************************************
 */

public class E07B_lowestCommonAncestor {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA1();
		int n1 = 4;
		int n2 = 6;
		
		Node lca = findLCA(root, n1, n2);
		System.out.println(lca.data);
	}
	
	
	private static Node findLCA(Node root, int n1, int n2) {
		if (root == null)
			return null;
		
		if (root.data == n1 || root.data == n2)
			return root;
		
		Node left_lca = findLCA(root.left, n1, n2);
		Node right_lca = findLCA(root.right, n1, n2);
		
		if (left_lca!=null && right_lca!=null)
			return root;
		
		return (left_lca != null) ? left_lca : right_lca;
	}
	
}
