package com.grind.misc;

public class PrintTree {
	
	static class Node
	{
		Node left, right;
		int val;
		public Node() {}
		public Node(int val) {
			this.val=val;
			this.left=null;
			this.right=null;
		}
		public Node(Node left, Node right, int val) {
			this.left=left;
			this.right=right;
			this.val=val;
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(1);
		node.right = new Node(2);
		node.right.right = new Node(5);
		node.right.right.left = new Node(3);
		node.right.right.left.right = new Node(4);
		printNodeOfTree(node,"");
	}

	 private static void printNodeOfTree(Node node, String prefix) 
	 {		
		if(node == null)return;
		System.out.println(prefix+"+"+node.val);
		printNodeOfTree(node.left, prefix+" ");
		printNodeOfTree(node.right, prefix+" ");
	}	

}
