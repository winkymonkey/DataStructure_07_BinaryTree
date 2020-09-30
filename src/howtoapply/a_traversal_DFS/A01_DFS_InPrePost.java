package howtoapply.a_traversal_DFS;

import core.Node;
import core.TreeUtil;



public class A01_DFS_InPrePost {
	private static A01_DFS_InPrePost obj = new A01_DFS_InPrePost();
	
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree();
		
		System.out.print("InOrder:::");
		obj.inOrder(root);
		
		System.out.print("\nPreOrder::");
		obj.preOrder(root);
		
		System.out.print("\nPostOrder:");
		obj.postOrder(root);
	}
	
	
	public void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	
	public void preOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if(node==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}
}
