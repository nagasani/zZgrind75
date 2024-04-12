package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

//Find all the subsets of [1,2,3,4,5]
//State Space Tree
public class BackTrack 
{	
	public static void main(String[] args) 
	{
		System.out.println("Back Tack");
		
		List<List<Integer>> all = new ArrayList<>();
		//backTacking(new int[] {1,2,3,4}, new ArrayList<Integer>(), all, 0);	
		backTrackFinalWithOurErrors(all, new ArrayList<>(), new int[] {1,1}, 0);
		//all.stream().forEach(System.out::println);
		for(List<Integer> lst : all) 
		{
			System.out.println(lst);
		}
	}
	
	public static void backTacking(int[] nums, List<Integer> current, List<List<Integer>> all, int start)
	{		
		all.add(new ArrayList<>(current));	
		for(int i=start; i < nums.length; i++) {
			current.add(nums[i]);
			backTacking(nums, current, all, i+1);
			current.remove(current.size()-1);
		}		
	}
	
	public static void backTacking2(int[] nums, List<Integer> current, List<List<Integer>> all, int start)
	{		
		all.add(new ArrayList<Integer>(current));
		for(int i=start; i < nums.length; i++) 
		{
			//Including the number
			current.add(nums[i+1]);
			//backTrack
			backTacking2(null, current, all, start+1);
			//Excluding Number
			current.remove(current.size()-1);
		}
		
	}
	
	public static void backTracking3(List<List<Integer>> all, List<Integer> current, int[] nums, int start) {
		all.add(new ArrayList<Integer>(current));
		
		for(int i=start; i < nums.length; i++) 
		{
			//Add next nums
			current.add(nums[i]);
			//back Track next ones
			backTracking3(all, current, nums, i+1);
			//Excluding Number
			current.remove(current.size()-1);
		}		
	}
	
	public static void backTrack4(List<List<Integer>> all, List<Integer> current, int[] nums, int start) {
		all.add(new ArrayList<>(current));
		
		//Iterate All the elements and nums <--> nums only
		for(int i=start; i < nums.length; i++) 
		{
			//Add next nums
			current.add(nums[i]);
			//backtrack next all elements plus next
			backTrack4(all, current, nums, i+1); //Just remember the next one
			//Remove the added one continue backtrack
			current.remove(current.size()-1);
		}
	}
	
	public static void backTrackFinalWithOurErrors(List<List<Integer>> all,
			List<Integer> current, int[] nums, int start) 
	{
		//New ArrayList otherwise it will override all the existing ones.
		all.add(new ArrayList<>(current));
		
		//Iterate array and add one by one to current 
		//We starting from I because we have already accounted for the rest since we are starting from 0
		for(int i= start; i < nums.length; i++) {
			//Two scenarios one with and one without
			// One With
			current.add(nums[i]);
			//Backtrack next 
			backTrackFinalWithOurErrors(all, current, nums, i+1);//i+1 because we have to backtrack next
			//removed the added one;
			current.remove(current.size()-1);
		}
		
		
	}
	
	private static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) 
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
