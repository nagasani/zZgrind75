package com.grind.meta;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) 
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
    	
    	Solution1 sol = new Solution1();
    	sol.twoSum(new int[]{2,7,11,15}, 9);
		
	}
}