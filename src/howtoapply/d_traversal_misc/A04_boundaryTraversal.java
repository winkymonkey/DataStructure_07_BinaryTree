package howtoapply.d_traversal_misc;

import core.Node;
import core.TreeUtil;

/**
 * *****************************************************************************
 * Boundary Traversal of binary tree
 * *****************************************************************************
 * I/P:
 * 		 1
 *     /   \
 *    2     3
 *   / \     \
 *  4   5     7
 *     / \
 *    10  11
 * 
 * O/P:
 * 1 2 3 10 11 7 3 1
 * 
 * *****************************************************************************
 */
public class A04_boundaryTraversal {
	private static A04_boundaryTraversal obj = new A04_boundaryTraversal();
	
	
	public static void main(String args[]) {
		Node root = TreeUtil.createNewTree3();
		if(root != null) {
			System.out.print(root.key + " ");
			
			obj.printBoundaryLeft(root.left);
			obj.printLeaves(root.left);
			obj.printLeaves(root.right);
			obj.printBoundaryRight(root.right);
		}
	}
	
	
	/* To ensure top down order, first print this node & then call itself for left subtree */
	void printBoundaryLeft(Node node) {
		if(node == null)
			return;
		else {
			if(node.left != null) {
				System.out.print(node.key + " ");
				printBoundaryLeft(node.left);
			}
			else if(node.right != null) {
				System.out.print(node.key + " ");
				printBoundaryLeft(node.right);
			}
			else {
				//Leaf node
				//do nothing to avoid duplicates in output
			}
		}
	}
	
	
	void printLeaves(Node node) {
		if(node == null)
			return;
		else {
			if(node.left == null && node.right == null)		//leaf node
				System.out.print(node.key + " ");
			printLeaves(node.left);
			printLeaves(node.right);
		}
	}
	
	
	/* To ensure bottom up order, first call itself for right subtree & then print this node */
	void printBoundaryRight(Node node) {
		if(node == null)
			return;
		else {
			if(node.right != null) {
				printBoundaryRight(node.right);
				System.out.print(node.key + " ");
			}
			else if(node.left != null) {
				printBoundaryRight(node.left);
				System.out.print(node.key + " ");
			}
			else {
				//Leaf node
				//do nothing to avoid duplicates in output
			}
		}
	}
}
