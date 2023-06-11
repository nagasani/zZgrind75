package com.grind.imp;

import java.util.HashMap;
import java.util.Map;

class Solution169 {
    public int majorityElement(int[] nums) 
    {
    	Map<Integer, Integer> map = new HashMap<>();    	    
    	for(int i : nums) {
    		int k = map.getOrDefault(i, 0)+1;
    		if (k > nums.length/2) return i;
    		map.put(i, k);
    	}     
    	return 0;
    }
}