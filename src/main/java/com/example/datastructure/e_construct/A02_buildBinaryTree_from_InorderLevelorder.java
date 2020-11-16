package com.example.datastructure.e_construct;

import com.example.datastructure.Node;


/**
 * *****************************************************************************
 * Construct a tree from Inorder and Level order traversals | Set 1
 * *****************************************************************************
 */
public class A02_buildBinaryTree_from_InorderLevelorder {
	
	public static void main(String[] args) {
		int inArr[] = {4, 8, 10, 12, 14, 20, 22};
		int levelArr[] = {20, 8, 22, 4, 12, 10, 14};
		Node root = buildTree(inArr, levelArr);
		System.out.println(root);
	}
	
	
	private static Node buildTree(int inArr[], int levelArr[]) {
		Node startnode = null;
		int inStart = 0;
		int inEnd = inArr.length-1;
		return constructTree(startnode, levelArr, inArr, inStart, inEnd);
	}
	
	
	private static Node constructTree(Node startNode, int[] levelArr, int[] inArr, int inStart, int inEnd) {
		if(inStart > inEnd)
			return null;
		if(inStart == inEnd)
			return new Node(inArr[inStart]);

		boolean found = false;
		int index = 0;

		// it represents the index in inArr array of element that appear first in levelArr array.
		for(int i=0; i<levelArr.length-1; i++) {
			for(int j=inStart; j<inEnd; j++) {
				if(levelArr[i] == inArr[j]) {
					startNode = new Node(levelArr[i]);
					index = j;
					found = true;
					break;
				}
			}
			if(found == true)
				break;
		}
		
		startNode.left = constructTree(startNode, levelArr, inArr, inStart, index-1);
		startNode.right = constructTree(startNode, levelArr, inArr, index+1, inEnd);

		return startNode;
	}
	
}
