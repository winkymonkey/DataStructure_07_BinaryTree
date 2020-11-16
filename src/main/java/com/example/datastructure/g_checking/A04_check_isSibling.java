package com.example.datastructure.g_checking;

import com.example.datastructure.a_core.Node;
import com.example.datastructure.a_core.TreeUtil;


public class A04_check_isSibling {
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		boolean isSibling = checkSiblings(root, 10, 11);
		System.out.println(isSibling);
	}
	
	private static boolean checkSiblings(Node node, int a, int b) {
		if(node == null || node.left==null || node.right==null)
			return false;
		
		else if((node.left.key==a && node.right.key==b) || (node.left.key==b && node.right.key==a))
			return true;
		
		return (checkSiblings(node.left, a, b) || checkSiblings(node.right, a, b));		
	}
	
}
