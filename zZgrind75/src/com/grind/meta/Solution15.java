package com.grind.meta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) 
    {
    	Set<List<Integer>> set = new HashSet<>();
    	for(int i =0; i < nums.length; i++) 
    	{
    		int target = -1*nums[i];
    		int[] result = twoSum(nums, target);
    		if(result != null) {
    			set.add(null);
    		}
    	}
        return null;
    }
    
    public List<List<Integer>> threeSumBruteForce(int[] nums) 
    {	
    	Set<List<Integer>> set = new HashSet<>();
    	for(int i =0; i < nums.length; i++) 
    	{
    		for(int j =i+1; j < nums.length; j++) 
        	{
    			for(int k =j+1; k < nums.length; k++) 
    	    	{
    	    		if(nums[i]+nums[j]+nums[k] == 0) 
    	    		{
    	    			List<Integer> lst = Arrays.asList(nums[i],nums[j],nums[k]);
    	    			Collections.sort(lst);
    	    			set.add(lst);
    	    		}
    	    	}
        	}
    	}    	
        return new ArrayList<List<Integer>>(set);
    }
    
    
    public static int[] twoSum(int[] nums, int target ) 
    {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				
				return new int[] {i, map.get(target-nums[i])};
			}
			map.put(nums[i], i);
		}
		return null;
	}
    
    public static void main(String[] args) {
		
	}
}