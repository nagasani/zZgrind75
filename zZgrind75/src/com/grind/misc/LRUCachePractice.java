package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

public class LRUCachePractice {

	public DoublyLinkedList list;
	public Map<Integer, Node> map;
	public int size;
	public int index;
	
	public LRUCachePractice(int size) {
		map = new HashMap<Integer, Node>();
		list = new DoublyLinkedList();
		this.size = size;
		index = 0;		
	}
	
	public int get(int key) {
		Node node = map.get(key);
		if(node == null) {
			return -1;
		}
		list.moveNodeToFront(node);
		return node.value;
	}
	
	public void put(int key, int value) {
		Node node = map.get(key);
	}
	
	public class Node{
		int key, value;
		Node next;
		Node prev;
		
		public Node(int key, int value) {
			this.key=key;
			this.value=value;
		}
	}
	
	public class DoublyLinkedList{
		
		Node first;
		Node last;
		
		
		public void moveNodeToFront(Node node) 
		{
			if(node == null) {
				//this.node = node;
				node = first;
			}
			else 
			{
				node.next = node;
			}
		}
		
		public void removeNode(Node node) {
			
		}
	}
}
