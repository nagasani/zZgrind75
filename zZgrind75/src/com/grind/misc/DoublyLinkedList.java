package com.grind.misc;

import java.util.LinkedList;

public class DoublyLinkedList {
	
	Node front;
	Node rear;
		
	class Node{
		
		Node left;
		Node right;
		int val;
		
		public Node(Node left, Node right, int val) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
		public Node(int val) {
			this.val= val;
			this.left = null;
			this.right = null;
		}		
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.addFirst(1);
		lst.addLast(2);
		
	}
	
	public void addNodeToLeft(Node node) {
		
		
	} 

}
