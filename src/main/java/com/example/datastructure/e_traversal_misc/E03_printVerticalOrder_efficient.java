package com.example.datastructure.e_traversal_misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * *****************************************************************************
 * Print a Binary Tree in Vertical Order | Set 2
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
 * *****************************************************************************
 */

public class E03_printVerticalOrder_efficient {
	/*
	 * Here we need to check the Horizontal Distance (HD) from root for all nodes.
	 * If two nodes have the same Horizontal Distance (HD), then they are on same vertical line.
	 * HD for root is 0
	 * A right edge is considered as HD+1
	 * A left edge is considered as HD-1
	 * 
	 * We can do PreOrder traversal & while traversing we can recursively calculate HDs.
	 * We initially pass the (HD = 0) for root.
	 * For left subtree, we pass the (HD = HD of root - 1)
	 * For right subtree, we pass the (HD = HD of root + 1)
	 * 
	 * For every HD value, we maintain a list of nodes in a Map.
	 * While traversing, for every Node we add the node to the hash map using HD as a key in map.
	 * 
	 */
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA7();
		printVerticalOrder(root);
	}
	
	
	private static void printVerticalOrder(Node root) {
		TreeMap<Integer,List<Integer>> map = new TreeMap<>();
		getVerticalOrder(root, 0, map);
		
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
	        System.out.println(entry.getValue());
	    }
	}
	
	
	private static void getVerticalOrder(Node root, int hd, Map<Integer, List<Integer>> map) {
		if (root == null)
			return;

		List<Integer> list = map.get(hd);
		if (list == null) {
			list = new ArrayList<>();
			list.add(root.data);
		}
		else
			list.add(root.data);
		
		map.put(hd, list);
		
		getVerticalOrder(root.left, hd-1, map);
		getVerticalOrder(root.right, hd+1, map);
	}
	
}
