package com.example.datastructure;


public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}	
}
