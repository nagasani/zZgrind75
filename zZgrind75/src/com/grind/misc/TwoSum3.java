package com.grind.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum3 {
	
	public static void main(String[] args) 
	{		
		int[] nums = new int[]{1,3,5,9,16,94,99,1089};
		int result = 100;	
		toSum(nums, result);
		//(Arrays.asList(toSum(nums, result))).forEach(System.out::println);
	}
	
	public static int[] toSum(int[] nums, int result)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < nums.length; i++ ) 
		{
			if(!map.containsKey(nums[i])) 
			{
				map.put(result - nums[i], i);
			}
			else 
			{
				System.out.println(map.get(nums[i])+"  "+i);
				return new int[] {i, map.get(nums[i])};
			}
		}
		return new int[] {};
	}	
}
