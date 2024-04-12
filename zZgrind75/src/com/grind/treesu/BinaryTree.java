package com.grind.treesu;

public class BinaryTree {
	
	class Node
	{
		Node left, right;
		int data;
	}

	class BST
	{

		public Node addNode(Node node, int i) 
		{
			// TODO Auto-generated method stub
			if(node == null) 
			{
				return createNewNode(i);
			}
			if(node.data > i) 
			{
				node.left = addNode(node.left, i);
			}
			if(node.data < i) 
			{
				node.right = addNode(node.right, i);
			}
			return node;
		}

		private Node createNewNode(int i) 
		{			
			Node node = new Node();
			node.left=node.right=null;
			node.data=i;
			return node;
		}
		
	}
	
	public static void main(String[] args) 
	{
		BST bst = new BinaryTree().new BST(); 
		Node root = null;
		root = bst.addNode(root, 8);
		root = bst.addNode(root, 5);
		root = bst.addNode(root, 1);
		root = bst.addNode(root, 9);
		root = bst.addNode(root, 25);
		printTree(root, "");
	}

	private static void printTree(Node node, String prefix) {		
		if(node == null)return;
		System.out.println(prefix+"+"+node.data);
		printTree(node.left, prefix+" ");
		printTree(node.right, prefix+" ");
		
	}	
}
