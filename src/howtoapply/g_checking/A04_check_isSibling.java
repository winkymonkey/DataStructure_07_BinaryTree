package howtoapply.g_checking;

import core.Node;
import core.TreeUtil;


public class A04_check_isSibling {
	private static final A04_check_isSibling obj = new A04_check_isSibling();
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		boolean isSibling = obj.checkSiblings(root, 10, 11);
		System.out.println(isSibling);
	}
	
	private boolean checkSiblings(Node node, int a, int b) {
		if(node == null || node.left==null || node.right==null)
			return false;
		else if((node.left.key==a && node.right.key==b) || (node.left.key==b && node.right.key==a))
			return true;
		
		return (checkSiblings(node.left, a, b) || checkSiblings(node.right, a, b));		
	}
}
