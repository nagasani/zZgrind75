package com.grind.zip;

public class BinaryTree {
	
	class Node{
		int val;
		Node left, right;
		public Node(int val) 
		{
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		//BinaryTree b = new BinaryTree();
		Node node = new BinaryTree().new Node(5);
		node.left = new BinaryTree().new Node(4);
		node.right = new BinaryTree().new Node(8);
		printTree(node,"");
	}
	
	private static void printTree(Node node, String prefix) 
	 {		
		if(node == null)return;
		System.out.println(prefix+"+"+node.val);
		printTree(node.left, prefix+" ");
		printTree(node.right, prefix+" ");
	}	
}
