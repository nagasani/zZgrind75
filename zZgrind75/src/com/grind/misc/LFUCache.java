package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

class LFUCache 
{
	int capacity;
	Map<Integer, Integer> map = new HashMap<>();
	Map<Integer, DoubleLinkedList> frequencyMap = new HashMap<>();

    public LFUCache(int capacity) 
    {
    	
    }
    
    public int get(int key) 
    {
     
       return 1;
    }
    
    public void put(int key, int value) 
    {
    	
    }
    
    class Node{
    	
    	Node prev;
    	Node next;
    	int key;
    	int val;
    	int freq;
    	
    	public Node(int key, int val) {
    		this.key = key;
    		this.val = val;
    		this.freq = 1;    		
    	}
    }
    
    class DoubleLinkedList
    {    
    	int listSize;
    	Node head;
    	Node tail;
    }
    
    
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(3); // Initial capacity of 3

        // Sequence of operations
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        lfuCache.put(3, 3);
        lfuCache.put(4, 4);

        System.out.println("Get 4: " + lfuCache.get(4)); // should return 4
        System.out.println("Get 3: " + lfuCache.get(3)); // should return 3
        System.out.println("Get 2: " + lfuCache.get(2)); // should return 2
        System.out.println("Get 1: " + lfuCache.get(1)); // should return -1 (evicted)

        lfuCache.put(5, 5); // Evicts key 2

        System.out.println("Get 1: " + lfuCache.get(1)); // should return -1 (not found)
        System.out.println("Get 2: " + lfuCache.get(2)); // should return -1 (evicted)
        System.out.println("Get 3: " + lfuCache.get(3)); // should return 3
        System.out.println("Get 4: " + lfuCache.get(4)); // should return 4
        System.out.println("Get 5: " + lfuCache.get(5)); // should return 5
    }
}
