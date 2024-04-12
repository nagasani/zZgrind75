package com.grind.imp;

import java.util.HashMap;
import java.util.Map;

class Solution76 {
	//https://www.youtube.com/watch?v=U1q16AFcjKs
    public String minWindow(String s, String t) {
         if (t.length() > s.length()) return "";
        int[] counts = new int[256];
        for (char c : t.toCharArray()) {
            counts[c]++;
        }
        int left = 0, right = 0, n = t.length(), start = 0, len = Integer.MAX_VALUE;
        char[] chars = s.toCharArray();
        while (right < s.length()) {
            if (counts[chars[right++]]-- > 0) n--;
            while (n == 0) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                } 
                if (counts[chars[left++]]++ >= 0) n++;
            }
        }
        len = len == Integer.MAX_VALUE ? 0 : len;
        return s.substring(start, start + len);
        
    }
    
    public String minWindowSliding(String s, String t) {
    	
    	Map<Character, Integer> map = new HashMap<>();
    	char[] c = t.toCharArray();
    	for(Character c1 : c) 
    	{
    		map.put(c1, map.getOrDefault(c, 0)+1);
    	}
    	
    	int i =0;
    	int j =0;
    	int count = map.size();
    	boolean found = false;
    	int left = 0;
    	int right =0;
    	int min = s.length();
    	
    	while(j < s.length()) 
    	{
    		char endChar = s.charAt(j++);
    		if(map.containsKey(endChar)) 
    		{
    			map.put(endChar, map.get(endChar)-1);
    			if(map.get(endChar) == 0) {count --;}
    		}
    		if(count  > 0) {
    			continue;
    		}
    		
    		while(count == 0)
    		{
    			char startChar = s.charAt(i++);
    			if(map.containsKey(startChar)) 
        		{
        			map.put(startChar, map.get(startChar)+1);
        			if(map.get(startChar) == 0) {count ++;}
        		}
    		}
    		if ((j-i) < min) {
    			left = i;
    			right =j;
    			min = j-i;
    			found = true;
    		}
    	}
    	
    	return !found ? "" : s.substring(left-1, right);
    }
    
    public static void main(String[] args) {
		
	}
}