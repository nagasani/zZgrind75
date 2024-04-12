package com.grind.treesu;

public class BinaryTreeOperations 
{
	class Node 
	{
		Node left, right;
		int data;
	}

	class BST 
	{
		public Node addNode(Node node, int i) 
		{
			if (node == null) 
			{
				return createNode(i);
			}
			if (node.data > i) 
			{
				node.left = addNode(node.left, i);
			}
			if (node.data < i) 
			{
				node.right = addNode(node.right, i);
			}
			return node;
		}

		private Node createNode(int i) 
		{
			Node node = new Node();
			node.data = i;
			node.left = null;
			node.right = null;
			return node;
		}

		public Node deleteNode(Node node, int i) 
		{
			if (node == null) 
			{
				return null;
			}
			if (node.data > i) 
			{
				node.left = deleteNode(node.left, i);
			} 
			else if (node.data < i) 
			{
				node.right = deleteNode(node.right, i);
			} 
			else 
			{
				if (node.right == null || node.left == null) 
				{
					Node temp = null;
					temp = node.left == null ? node.right : node.left;
					if (temp == null) 
					{
						return null;
					} 
					else 
					{
						return temp;
					}
				} 
				else 
				{
					Node successor = getSuccessor(node);
					node.data = successor.data;
					node.right = deleteNode(node.right, successor.data);
					return node;
				}
			}
			return node;
		}

		private Node getSuccessor(Node node) 
		{
			if (node == null) 
			{
				return null;
			}
			Node temp = node.right;
			while (temp.left != null) 
			{
				temp = node.left;
			}
			return temp;
		}

	}

	public static void main(String[] args) 
	{
		BST bst = new BinaryTreeOperations().new BST();
		Node root = null;

		root = bst.addNode(root, 8);
		root = bst.addNode(root, 3);
		root = bst.addNode(root, 6);
		root = bst.addNode(root, 10);
		root = bst.addNode(root, 4);
		root = bst.addNode(root, 7);
		root = bst.addNode(root, 1);
		root = bst.addNode(root, 14);
		root = bst.addNode(root, 13);

		bst.deleteNode(root, 1);
	}
}
