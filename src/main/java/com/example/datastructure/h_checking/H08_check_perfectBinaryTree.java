package com.example.datastructure.h_checking;

/**
 * *****************************************************************************
 * Check whether a given binary tree is perfect or not
 * *****************************************************************************
 * Perfect binary tree -- all internal nodes have two children and all leaves are at same level
 * 
 * *****************************************************************************
 */

public class H08_check_perfectBinaryTree {
	/*
	 * 1.check if a node have both left and right child.
	 * 2.search leaf nodes recursively in both left and right subtree.
	 * 3.during traversal, pass a variable called "level" in recursion call.
	 * 4.for each level of the tree, increment level by 1.
	 * 5.if a leaf is found, compare its value with storedLevel
	 * 6.if (level!=storedLevel), break and return...otherwise continue
	 * 
	 */
}
