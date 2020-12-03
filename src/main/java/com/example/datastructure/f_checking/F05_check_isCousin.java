package com.example.datastructure.f_checking;

/**
 * *****************************************************************************
 * Check if two nodes are cousins in a Binary Tree
 * *****************************************************************************
 * Cousin Nodes -- if two nodes are at same level and have different parents
 * *****************************************************************************
 *      6
 *    /   \
 *   3     5
 *  / \   / \
 * 7   8 1   3
 * 
 * isCousin(7,1) = TRUE
 * isCousin(3,5) = FALSE
 * isCousin(7,5) = FALSE
 * 
 * *****************************************************************************
 */

public class F05_check_isCousin {
	/*
	 * find level of both the nodes & check is they are at same level
	 * if they are at same level, go to next step... otherwise return false
	 * 
	 * now check if they are siblings or not
	 * if they are not siblings, return true... otherwise return false
	 * 
	 */
}
