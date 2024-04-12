package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

public class LRUAgain {
	
	private int size;
	private int capacity;
	private Map<Integer, Node> map;
	private LRUDoublyLinkedList lst;	
	
	public LRUAgain(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		//lst = 
	}
	
	class Node
	{
		int key;
		int val;
		Node previous;
		Node next;
		
		public Node(int key, int val) 
		{
			this.key = key;
			this.val = val;
			this.previous = null;
			this.next = null;
		}
	}
	
	class LRUDoublyLinkedList{
		
	}

}
