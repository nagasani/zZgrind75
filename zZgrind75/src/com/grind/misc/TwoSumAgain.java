package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

public class TwoSumAgain {
	
	public static int[] twoSum(int[] nums, int target) 
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i < nums.length; i++) {
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
