package com.example.datastructure.e_traversal_misc;

/**
 * *****************************************************************************
 * Print a Binary Tree in Vertical Order | Set 2
 * *****************************************************************************
 */
public class A03_printVerticalOrder_efficient {
	/*
	 * We need to check the Horizontal Distances from root for all nodes.
	 * If two nodes have the same Horizontal Distance (HD), then they are on same vertical line.
	 * 
	 * We can do preorder traversal & while traversing we can recursively calculate HDs.
	 * We initially pass the (HD = 0) for root.
	 * 	- For left subtree, we pass the (HD = HD of root - 1)
	 * 	- For right subtree, we pass the (HD = HD of root + 1)
	 * 
	 * For every HD value, we maintain a list of nodes in a hashmap.
	 * While traversing, for every Node we add the node to the hash map using HD as a key in map.
	 * 
	 */
}
