package howtoapply.c_traversal_BFS;

import core.Node;
import core.TreeUtil;



public class A03_printSpecificLevel_inReverse {
	private static A03_printSpecificLevel_inReverse obj = new A03_printSpecificLevel_inReverse();
	
	
	public static void main(String[] args) {
		Node root = TreeUtil.createNewTree3();
		int targetLevel = 4;
		obj.printTargetLevelInReverse(root, targetLevel);
	}
	
	
	private void printTargetLevelInReverse(Node node, int level) {
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.key + " ");
		
		else if(node!=null && level > 1) {
			printTargetLevelInReverse(node.right, level-1);
			printTargetLevelInReverse(node.left, level-1);
		}
	}
}
