package com.grind.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class Solution416 
{	
	public static boolean can = false;
	public static boolean canPartition(int[] nums) 
	{
		int sum =0;
		for(int i=0; i < nums.length; i++ ) 
		{
			sum +=nums[i];
		}
		if(sum%2 == 1) 
		{
			return false;
		}
		
		backTrack(nums, 0, new ArrayList<Integer>(), sum/2);
		
      return false;
	}
	
	private static void backTrack(int[] nums, int i, ArrayList<Integer> arrayList, int half) 
	{
		
		if(arrayList.stream().mapToInt(Integer::intValue).sum() == half) {
			can = true;
			return;
		}
	}

	public static void main(String[] args) {
		System.out.println(canPartition(new int[] {1,5,11,5}));
	}
}