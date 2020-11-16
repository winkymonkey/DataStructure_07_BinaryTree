package com.example.datastructure.c_traversal_BFS;

/**
 * *****************************************************************************
 * Reverse alternate levels of a perfect binary tree
 * *****************************************************************************
 */

public class C04_LevelOrder_reverseAlternateLevels {
	/*
	 * ---------------
	 * TWO TRAVERSALS
	 * ---------------
	 * 1.traverse the tree in one specific style (i.e. in, pre, post, level)
	 * 2.while traversing, store odd level nodes in auxiliary array AUX[]
	 * 3.reverse AUX[]
	 * 4.traverse the tree once again in exactly same style as earlier
	 * 5.while traversing, for odd level traversal replace the node by AUX[i]
	 * 6.i++
	 * 
	 * 
	 * 
	 * 
	 * --------------
	 * ONE TRAVERSAL
	 * --------------
	 * void main() {
	 * 		reverseAlternate(root.left, root.right, 1);
	 * }
	 * 
	 * void reverseAlternate(Node root1, Node root2, int level) {
	 * 		if(root1==null || right==root2)
	 * 			return;
	 * 		if(level is ODD)
	 * 			Swap root1.key and root2.key	//Swap subtrees
	 * 		
	 * 		reverseAlternate(root1.left, root2.right, level+1);
	 * 		reverseAlternate(root1.right, root2.left, level+1);
	 * }
	 * 
	 */
}
