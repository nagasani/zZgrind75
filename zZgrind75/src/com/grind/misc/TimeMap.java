package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

public class TimeMap {
	
	public static Map<String, Node> map;
	
    public TimeMap() 	
    {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
    	Node node = map.get(key);
    	if(node == null) {
    		node = createNode(value, timestamp);
    	}
    	else {
    		node = addNode(node, value, timestamp);
    	}
    	
    	map.put(key, node);
    }
    
	public String get(String key, int timestamp) 
    {
    	Node node = map.get(key);
    	node = searchNode(node, timestamp);
    	return node == null ? null : node.data;
    }
    
    public Node createNode(String value, int timestamp) 
	{
		Node node = new Node();
		node.data = value;
		node.timeStamp = timestamp;
		node.right = null;
		node.left= null;
		return node;		
	}	
    
    public Node searchNode(Node node, int val) 
    {
    	if(node == null) {
    		return null;
    	}
		if(node.timeStamp == val) {
			return node;
		}
		if(node.timeStamp > val) {
			return searchNode(node.left, val);
		}
		if(node.timeStamp < val) {
			return searchNode(node.right, val);
		}			
		return null;
	}
    
    private Node addNode(Node node, String value, int timestamp) {
    	if(node == null) {
			node = createNode(value, timestamp);
		}
		if(node.timeStamp > timestamp) 
		{
			node.left = addNode(node.left,value, timestamp);
		}
		if(node.timeStamp < timestamp) 
		{
			node.right = addNode(node.right, value, timestamp);
		}
		return node;
	}
    
    class Node
	{
		Node left, right;
		String data;
		int timeStamp;
	}

}