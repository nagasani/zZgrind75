package com.grind.misc;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//Wrong implementation
class LFUCache1 
{
    int capacity;
    PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
    		(x,y) -> {
    					
    					return  x.getValue()-y.getValue() == 0 ? -1: x.getValue().compareTo(y.getValue());
    				  }
    		);
    Map<Integer, Integer> map;
    int counter;    

    public LFUCache1(int capacity) 
    {
    	System.out.println("null");
        this.capacity = capacity;
        this.map = new HashMap<>();  
        this.counter = 0;
    }
    
    public int get(int key) 
    {
      if(this.map.keySet().contains(key))
      {
    	  addToQueue(key, true);
      }
      return  this.map.getOrDefault(key, -1);  
       
    }
    
    public void put(int key, int value) 
    {
    	System.out.println("null");
        if(this.map.keySet().contains(key))
        {
        	//Update    
        	this.map.put(key, value);
        	addToQueue(key, true);
        }
        else 
        {
        	//Add
        	if(counter == capacity) 
        	{
        		Map.Entry<Integer, Integer> entry = this.queue.poll();
        		this.map.remove(entry.getKey());
        	}
        	else
        	{
        		counter++; 
        	}
        	this.map.put(key, value);
        	addToQueue(key, false);
        }        
    }
    
    public void addToQueue(int key, boolean found) 
    {  
    	if(found) 
    	{
    		Map.Entry<Integer, Integer> me = null;
	    	for(Map.Entry<Integer, Integer> entry: this.queue) 
	    	{
	    		if(entry.getKey() == key) 
	    		{
	    			//entry.setValue(entry.getValue()+1);
	    			me = entry;	    			
	    			break;
	    		}
	    	}
	    	int val = me.getValue()+1;
	    	this.queue.remove(me);
	    	this.queue.offer(new AbstractMap.SimpleEntry<Integer, Integer>(key,val));
    	}
    	else
    	{
    		this.queue.add(new AbstractMap.SimpleEntry<>(key,1));
    	}
	}
    
    public static void main1(String[] args) 
    {
        LFUCache1 lfuCache = new LFUCache1(2);

        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        System.out.println("Get 1: " + lfuCache.get(1)); // returns 1

        lfuCache.put(3, 3); // evicts key 2
        System.out.println("Get 2: " + lfuCache.get(2)); // returns -1 (not found)
        System.out.println("Get 3: " + lfuCache.get(3)); // returns 3

        lfuCache.put(4, 4); // evicts key 1
        System.out.println("Get 1: " + lfuCache.get(1)); // returns -1 (not found)
        System.out.println("Get 3: " + lfuCache.get(3)); // returns 3
        System.out.println("Get 4: " + lfuCache.get(4)); // returns 4
    }
    
    public static void main(String[] args) {
        LFUCache1 lfuCache = new LFUCache1(3); // Initial capacity of 3

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
