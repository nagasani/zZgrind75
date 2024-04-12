package com.grind.meta;

import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
        	if(!set.add(num)) {
        		return true;
        	}
        }
        return true;        
    }
}