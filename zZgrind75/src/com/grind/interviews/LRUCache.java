package com.grind.interviews;

import java.util.LinkedHashMap;
import java.util.Map;

//Paypal
public class LRUCache 
{
	Map<Integer, Integer> map;
	int capacity;
	
	public LRUCache(int capacity) {
		map = new LinkedHashMap<>(capacity);		
		this.capacity = capacity;
	}
    
    public int get(int key) {
    	Integer val = map.get(key);
    	if( val == null) {
    		return -1;
    	}
    	map.remove(key);
    	map.put(key, val);
    	return val;
    }
    
    public void put(int key, int value) 
    {
    	Integer val = map.get(key);
    	if( val == null) {
    		if(map.size() == capacity) {
    			int firstKey = 0;
    			for(Integer i : map.keySet()) {
    				firstKey = i;
    				break;
    			}
    			map.remove(firstKey);
    		}    		
    		map.put(key, value);
    	}
    	else {
    		Map<Integer, Integer> map1 =  new LinkedHashMap<>();
    		for(Integer i : map.keySet()) 
    		{
    			if(i == key) {
    				continue;
    			}
    			map1.put(i, map.get(i));
			}
    		map1.put(key, value);
    		map = map1;    		
    	}    	
    }  
    
    public static void main(String[] args) {
		/*
		 * LRUCache cache= new LRUCache(2); cache.put(1, 1); cache.put(2, 2);
		 * cache.get(1); cache.put(3, 3); cache.get(2); cache.put(4, 4); cache.get(1);
		 * cache.get(3); cache.get(4);
		 */
		/*
		 * LRUCache cache= new LRUCache(2); cache.put(1, 0); cache.put(2, 2);
		 * cache.get(1); cache.put(3, 3); cache.get(2); cache.put(4, 4); cache.get(1);
		 * cache.get(3); cache.get(4);
		 */
    	LRUCache cache= new LRUCache(2);
    	cache.put(2, 1);
    	cache.put(1, 1);
    	
    	cache.put(2, 3);
    	
    	cache.put(4, 1);
    	cache.get(1);
    	cache.get(2);   
    	
    	cache.get(1);
	}
}