package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=3tpjp5h3M6Y
class Solution78 
{
	//1,2,3,4
	//Revisit state space tree.
    public static List<List<Integer>> subsets(int[] nums) 
    {
    	
    	 List<List<Integer>> subsets = new ArrayList<>();
    	 List<Integer> current = new ArrayList<>();
    	 backtrack(nums,0, current, subsets);
    	
    	return subsets;
    }
    
    public static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }
    
    private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) 
    {
    	// Add the set to result set
		resultSets.add(new ArrayList<>(tempSet));
		
		for (int i = start; i < nums.length; i++) 
		{		
			// Case of including the number
			tempSet.add(nums[i]);
			
			// Backtrack the new subset
			backtrack(resultSets, tempSet, nums, i + 1);
			
			// Case of not-including the number
			tempSet.remove(tempSet.size() - 1);
		}
}
    
    
}