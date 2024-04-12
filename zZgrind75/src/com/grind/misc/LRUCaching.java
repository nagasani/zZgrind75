package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

class LRUCaching {
	
	int capacity;
	int size;
	Map<Integer, Node> map;
	DoublyLinkedList lst;

    public LRUCaching(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }
    
    public int get(int key) {
     
    	return 0;
    }
    
    public void put(int key, int value) {
    	
        
    }
    
    class Node{
    	Node previous, next;
    	int data;
    }
    
    
    class DoublyLinkedList{
    	Node front;
    	Node rear;
    	
    	public void addToFront(Node node) {
    		
    	}
    	
    	public void moveToTheFront(Node node) {
    		
    	}
    	
    	public void deleteFromRear() {
    		
    	}
    }
}