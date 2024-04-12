package com.grind.zip;

import java.util.ArrayList;
import java.util.List;

//Leetcode 78 
// reslut, empty(To Hold future Findings), all values(nums), index(Where we start)
public class BackTracking {
	
	public static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		backTrack(result, current, nums, 0);
		return result;
    }

	private static void backTrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) 
	{
		result.add(new ArrayList<>(current));
		for(int i =start; i < nums.length; i++) 
		{
			current.add(nums[i]);
			backTrack(result, current, nums, i+1);
			current.remove(current.size()-1);				
		}
	}
	
	
	public static void main(String[] args) 
	{
		subsets(new int[] {1,2,3}).stream().forEach(System.out::println);
	}
	
	
	

}
