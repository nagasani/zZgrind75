package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

class Solution216 
{
	private static int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
    public static List<List<Integer>> combinationSum3(int k, int n) {
    	List<List<Integer>> all = new ArrayList<List<Integer>>();
    	backTrack(all, new ArrayList<>(), k, n, 0);
    	all.stream().forEach(System.out::println);
        return all;
    }
    
    public static void backTrack(List<List<Integer>> all, List<Integer> current, int count, int target, int start) 
    {
    	if(target == 0 && current.size() == count) 
    	{
    		all.add(new ArrayList<>(current));
    	}
    	
    	for(int i=start; i < nums.length; i++) 
    	{
    		if(target <= target && current.size() <= count) 
    		{
    			current.add(nums[i]);
    			backTrack(all, current, count, target-nums[i], i+1);
    			current.remove(current.size()-1);    		
    		}
    	}       
    }
    
    public static void main(String[] args) {
    	combinationSum3(3,7);
	}
    
}