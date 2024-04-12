package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

class LRUCache2 
{
	public Map<Integer, Node> map;
	public DoublyLinkedList list;
	int capacity;
	int size;

	public LRUCache2(int capacity) {
		this.capacity = capacity;
        map = new HashMap<>();
        list = new DoublyLinkedList();
        this.size = 0;
    }
    
    public int get(int key) {
    	Node node = map.get(key);
    	if(node == null) {
    		return -1;
    	}
    	list.moveToTheFront(node);        
    	return node.value;
    }
    
    public void put(int key, int value) 
    {
    	Node node = map.get(key);
    	if(node != null) 
    	{
    		node.value = value;
    		list.moveToTheFront(node);
    	}
    	else 
    	{
    		if(size < capacity) 
    		{    			
    			size++;
    		}
    		else 
    		{
    			list.removeRear();    			
    		}
    		list.addFront(new Node(key, value));
    	}
    }
    
    public class Node{
    	int key;
    	int value;
    	Node previous;
    	Node next;
    	
    	public Node(int key, int value) {
    		this.key = key;
    		this.value = value;
    	}
    }
    
    public class DoublyLinkedList
    {
    	Node rear;
    	Node front;
    	
    	 public DoublyLinkedList() {
             front = rear = null;
         }
    	
		public void moveToTheFront(Node node) {
			node.previous.next = node.next.previous; 
			node.previous = front;
			node = front;
		}
		public void removeRear() {			
			rear = rear.next;
			rear.previous = null;			
		}
		public void addFront(Node node) {
			node.previous = front;
			front = node;
		}		
    }


}