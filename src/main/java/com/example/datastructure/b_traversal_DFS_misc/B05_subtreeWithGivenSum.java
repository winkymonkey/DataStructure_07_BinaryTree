package com.example.datastructure.b_traversal_DFS_misc;

/**
 * *****************************************************************************
 * Subtree with given sum in a Binary Tree
 * *****************************************************************************
 * You are given a binary tree and a given sum.
 * The task is to check if there exist a subtree whose sum of all nodes is equal to the given sum.
 * *****************************************************************************
 *      1
 *    /   \
 *   3     6
 *  / \   /
 * 5   9 8
 * 
 * if given sum=17 	--> YES		//subtree as 3,5,9
 * if given sum=11  --> NO
 * 
 * *****************************************************************************
 */

public class B05_subtreeWithGivenSum {
	/*
	 * Do PreOrder traversal (root-left-right) 
	 * and in each recursive call, calculate the sum of current root, sum of left subtree, sum of right subtree
	 * and keep checking whether it matches with the given sum or not
	 * 
	 */
}
