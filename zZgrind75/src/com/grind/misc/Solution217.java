package com.grind.misc;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) 
    {
    	Set<Integer> set = new HashSet<>();
    	
    	for(int i : nums) 
    	{
    		if(set.contains(i)) 
    		{
    			return true;
    		}
    		set.add(i);
    	}
    	    	
        return false;
    }
}