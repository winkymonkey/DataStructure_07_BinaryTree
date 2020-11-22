package com.example.datastructure.d_traversal_BFS_misc;

import com.example.datastructure.Node;

/**
 * ************************************************************************
 * Connect nodes at same level
 * ************************************************************************
 * Write a function to connect all the adjacent nodes at the same level in a binary tree.
 * 
 * Input:
 *        1
 *       / \
 *      2   3
 *     / \   \
 *    4   5   6
 * 
 * Output:
 *        1-->NULL
 *       / \
 *      2-->3-->NULL
 *     / \   \
 *    4-->5-->6-->NULL
 * 
 * ************************************************************************
 */

public class D03B_connectNodesAtSameLevel {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		root = connect(root);
		System.out.println(root);
	}
	
	
	public static Node connect(Node root) {
        if (root == null)
            return null;
        
        Node current = root;
        
        while (current.left != null) {
            Node temp = current;
            
            while (current != null) {
            	if (current.left != null)
            		current.left.next = current.right;
                
                if (current.next == null)
                	current.right.next = null;
                else if (current.next.left == null && current.next.right == null)
                	current.right.next = null;
                else if (current.next.left != null && current.next.right == null)
                	current.right.next = current.next.left;
                else if (current.next.left == null && current.next.right != null)
                	current.right.next = current.next.right;
                
                current = current.next;
            }          
            current = temp.left;         
        }
        return root;
    }
	
}
