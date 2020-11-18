package com.example.datastructure.f_construct;

/**
 * *****************************************************************************
 * Print PostOrder traversal from given InOrder and PreOrder traversals
 * *****************************************************************************
 */

public class F01_postorder_from_InorderPreorder {
	/*
	 * We can print PostOrder traversal without constructing the tree.
	 * The root is always the first item in PreOrder traversal and must be the last item in PostOrder traversal.
	 * We first recursively print left subtree, then recursively print right subtree, finally print root.
	 * 
	 * To find boundaries of left and right subtrees in PRE[] and IN[], we search root in IN[]
	 * - all elements before root in IN[] are elements of left subtree
	 * - all elements after root in IN[] are elements of right subtree
	 * 
	 * In PRE[], all elements after index of root in IN[] are elements of right subtree.
	 * and all elements before index (including the element at index and excluding the first element) are elements of left subtree.
	 */
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int PRE[] = {1, 2, 7, 3, 4, 5};
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int preStart = 0;
		getPostOrder(inStart, inEnd, preStart);
	}
	
	
	private static void getPostOrder(int inStart, int inEnd, int preStart) {
		if (inStart == inEnd) {
			System.out.print(IN[inStart] + " ");
			return;
		}
		
		int result = search(inStart, inEnd, PRE[preStart]);
		
		if(inStart != result)
			getPostOrder(inStart, result-1, preStart+1);
		
		if(inEnd != result)
			getPostOrder(result+1, inEnd, result+1);
		
		System.out.print(IN[result] + " ");
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inStart; k <= inEnd; k++)
			if (key == IN[k])
				return k;
		return 0;
	}
	
}
