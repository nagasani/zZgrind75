package com.grind.treesu;

public class BinaryTreeAgain 
{
	
	public class Node
	{
		Node left, right;
		int val;		
	}
	
	class BST
	{	
		public Node addNode(Node node, int val) 
		{
			if(node == null) {
				node = createNode(val);
			}
			if(node.val > val) 
			{
				node.left = addNode(node.left, val);
			}
			if(node.val < val) 
			{
				node.right = addNode(node.right, val);
			}
			return node;
		}
		
		public Node createNode(int val) 
		{
			Node node = new Node();
			node.val = val;
			node.right = null;
			node.left= null;
			return node;		
		}	
		
		public Node searchNode(Node node, int val) {
			if(node.val == val) {
				return node;
			}
			if(node.val > val) {
				return searchNode(node.left, val);
			}
			if(node.val < val) {
				return searchNode(node.right, val);
			}			
			return null;
		}
	}
	
	public static void main(String[] args) {
		BST bst = new BinaryTreeAgain().new BST();
		Node root = null;
		root = bst.addNode(root, 8);
		root = bst.addNode(root, 9);
		root = bst.addNode(root, 4);
		root = bst.addNode(root, 1);
		printTree(root, "");
		printTree (bst.searchNode(root,4),"");
	}
	
	public static void printTree(Node node, String preFix) 
	{
		if(node == null) {return;}
		System.out.println(preFix+node.val);	
		if(node.left != null) {printTree(node.left, preFix+" ");}
		if(node.right != null) {printTree(node.right, preFix+" ");}
	}

}
