package com.example.datastructure.e_construct;

/**
 * *****************************************************************************
 * Print PostOrder traversal from given InOrder and PreOrder traversals
 * *****************************************************************************
 */
public class A01_postorder_from_InorderPreorder {
	static int in[] = {7, 2, 1, 4, 3, 5};
	static int pre[] = {1, 2, 7, 3, 4, 5};
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = in.length-1;
		int preStart = 0;
		getPostOrder(inStart, inEnd, preStart);
	}
	
	
	private static void getPostOrder(int inStart, int inEnd, int preStart) {
		if(inStart == inEnd) {
			System.out.println(in[inStart]);
			return;
		}
		else {
			int result = search(inStart, inEnd, pre[preStart]);
			
			if(inStart != result)
				getPostOrder(inStart, result-1, preStart+1);
			
			if(inEnd != result)
				getPostOrder(result+1, inEnd, result+1);
			
			System.out.println(in[result]);
		}
	}
	
	
	private static int search(int in_start, int in_end, int key) {
		for(int k=in_start; k<=in_end; k++)
			if(key == in[k])
				return k;
		return 0;
	}
}
