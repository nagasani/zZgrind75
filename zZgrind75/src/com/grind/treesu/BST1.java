package com.grind.treesu;

import com.grind.treesu.BinaryTreeAgain.Node;

public class BST1 {

	public class Node{
		Node right, left;
		int val;
	}
	
	class BinaryStree{
		
		public Node addNode(Node node, int val) {
			if(node == null) {
				node = createNode(val);
			}
			if(node.val > val) {node.left = addNode(node.left, val);}
			if(node.val < val) {node.right = addNode(node.right, val);}
			return node;
		}
		
		public Node createNode(int val) {
			Node node = new Node();
			node.val = val;
			node.left = null;
			node.right = null;
			return node;
		}
	}
	
	public static void main(String[] args) {
		BinaryStree tree = new BST1().new BinaryStree();
		Node root = null;
		root = tree.addNode(root, 8);
		root = tree.addNode(root, 9);
		root = tree.addNode(root, 4);
		root = tree.addNode(root, 1);
		printTree(root, "");
	}
	
	public static void printTree(Node node, String prefix) {
		if(node == null)return;
		System.out.println(prefix+"+"+node.val);
		printTree(node.left, prefix+" ");
		printTree(node.right, prefix+" ");		
	}
}
