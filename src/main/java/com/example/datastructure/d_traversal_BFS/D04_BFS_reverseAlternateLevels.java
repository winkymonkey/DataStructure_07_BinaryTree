package com.example.datastructure.d_traversal_BFS;

/**
 * *****************************************************************************
 * Reverse alternate levels of a perfect binary tree
 * *****************************************************************************
 * Example:
 * 
 * Given Tree:
 *            a
 *        /       \
 *      b           c
 *    /   \       /   \
 *   d     e     f     g
 *  / \   / \   / \   / \
 * h   i j   k l   m n   o
 * 
 * Modified Tree:
 *            a
 *        /       \
 *      c           b
 *    /   \       /   \
 *   d     e     f     g
 *  / \   / \   / \   / \
 * o   n m   l k   j i   h
 * 
 * *****************************************************************************
 */

public class D04_BFS_reverseAlternateLevels {
	/*
	 * void main() {
	 *    reverseAlternate(root.left, root.right, 1);
	 * }
	 * 
	 * void reverseAlternate(Node root1, Node root2, int level) {
	 *    if (root1==null || root2==null)
	 *       return;
	 *    
	 *    if (level is EVEN) {
	 *       swap root1.data and root2.data
	 *    }
	 * 	  else {
	 *       reverseAlternate(root1.left, root2.right, level+1);
	 *       reverseAlternate(root1.right, root2.left, level+1);
	 *    }
	 * }
	 * 
	 */
}
