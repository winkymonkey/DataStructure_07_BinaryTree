package com.example.datastructure.f_traversal_misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.example.datastructure.Node;
import com.example.datastructure.TreeUtilA;

/**
 * *****************************************************************************
 * Print a Binary Tree in Vertical Order
 * *****************************************************************************
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *            \   \
 *             8   9 
 * 
 * Output:
 * 		4
 * 		2
 * 		1 5 6
 * 		3 8
 * 		7
 * 		9
 * 
 * TIME --- O(n)
 * SPACE -- O(n)
 * 
 * *****************************************************************************
 */

public class F02B_printVerticalOrder {
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA7();
		
		Map<Integer, List<Integer>> map = new TreeMap<>();		//key=hd, value=list of elements at that distance
		getVerticalOrder(root, 0, map);
		
		map.values().forEach(val -> System.out.println(val));
	}
	
	
	private static void getVerticalOrder(Node root, int hd, Map<Integer, List<Integer>> map) {
		if (root == null)
			return;

		List<Integer> list = map.get(hd);
		if (list == null) {
			list = new ArrayList<>();
			list.add(root.data);
		}
		else
			list.add(root.data);
		
		map.put(hd, list);
		
		getVerticalOrder(root.left, hd-1, map);
		getVerticalOrder(root.right, hd+1, map);
	}
	
}
