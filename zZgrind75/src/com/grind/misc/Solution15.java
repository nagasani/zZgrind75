package com.grind.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution15 {
	
	public List<List<Integer>> threeSum(int[] nums) 
    {
		Set<List<Integer>> set = new HashSet<>();
		for(int i =0; i < nums.length-2; i++) 
		{
			int target = -1*nums[i];
			Map<Integer, Integer> map = new HashMap<>();
			for(int j=i+1; j < nums.length; j++) 
			{
				if(map.containsKey(target - nums[j])) 
				{
					List<Integer> l = new ArrayList<>(Arrays.asList(nums[i],nums[map.get(target-nums[j])],nums[j]));
					Collections.sort(l);						
					set.add(l);
				}
				map.put(nums[j], j);
			}			
		}
		return new ArrayList<>(set);
    }

	public static void main(String[] args) {
		 List<List<Integer>> lst = new Solution15().threeSum(new int[] {-1,0,1,2,-1,-4});
	}
}
