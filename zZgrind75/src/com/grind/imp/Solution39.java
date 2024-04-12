package com.grind.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.grind.misc.BackTrack;

//Still revisit
class Solution39 
{
	//[2,3,6,7]  7
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
    	
    	int left = 0;
    	int right = 0;
    	
    	Arrays.sort(candidates);
    	List<Integer> lst = new ArrayList<Integer>();
    	while(left >= candidates.length && right >= candidates.length) 
    	{
    		int mul = target/candidates[left];
    		///Dash Dash Dash
    	}
    	return null;
    }
    
    public static void main(String[] args) 
	{
		System.out.println("Back Tack");
		
		List<List<Integer>> all = new ArrayList<>();
		//backTacking(new int[] {1,2,3,4}, new ArrayList<Integer>(), all, 0);	
		combinationSum(all, new ArrayList<>(), new int[] {2,3,6,7}, 7, 0);
		all.stream().forEach(System.out::println);
	}
    
    public static void combinationSum(List<List<Integer>> all, List<Integer> current, int[] candidates, int target, int start)     
    {
    	 if (target == 0)
    	{
    		all.add(new ArrayList<Integer>(current));
    		return;
    	}
    	
    	for(int i = start; i < candidates.length; i++) 
    	{
    		if (candidates[i] <= target) 
    		{
	    		current.add(candidates[i]);
	    		combinationSum(all, current, candidates, target - candidates[i], i);
	    		current.remove(current.size()-1);
    		}
    	}    	
    }
    
    private static boolean sumList(List<Integer> current, int target) 
    {
    	int sum =0;
		for(int i =0; i < current.size(); i++) 
		{
			sum+=current.get(i);
		}
		return sum == target ? true:false;
	}

	private void backtrack(int[] candidates, int target, List<Integer> currentCombination, List<List<Integer>> combinations, int start) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                currentCombination.add(candidates[i]);
                backtrack(candidates, target - candidates[i], currentCombination, combinations, i);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}