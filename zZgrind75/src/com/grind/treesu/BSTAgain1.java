package com.grind.treesu;

public class BSTAgain1 {
	
	public class Node{
		Node left,right;
		int val;
	}
	
	class BstOperations{
		
		public Node addNode(Node node, int val) {
			if(node == null) {
				node = createNode(val);
			}
			else if(node.val > val) {
				node.left = addNode(node.left, val);
			}
			else if(node.val < val) { 
				node.right = addNode(node.right, val);
			}			
			return node;
		}
		
		public Node createNode(int val) {
			Node node = new Node();
			node.val = val;
			node.left = null;
			node.right = null;
			return node;
		}
		
		public Node searchNode(Node node, int val) {
			if(node == null) 
			{
				return null;
			}
			else if(node.val > val) 
			{
				return node;
			}
			else if(node.val > val) {
				node.left = searchNode(node.left, val);
			}
			else if(node.val < val) { 
				node.right = searchNode(node.right, val);
			}
			return node;
		}
	}
	
	public static void main(String[] args) {
		BstOperations bo = new BSTAgain1().new BstOperations();
		Node root = null;
		root = bo.addNode(root, 5);
		root = bo.addNode(root, 6);
		root = bo.addNode(root, 7);
		root = bo.addNode(root, 3);
		root = bo.addNode(root, 9);
		printNode(root, "");
	}

	public static void printNode(Node node, String prefix) {
		if(node == null) return; 
		System.out.println(prefix+node.val);		
		if(node.left != null) {
			printNode(node.left, prefix+" ");			
		}
		if(node.right != null) {
			printNode(node.right, prefix+" ");
		}		
	}
}
