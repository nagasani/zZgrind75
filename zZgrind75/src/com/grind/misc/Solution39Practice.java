package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class Solution39Practice 
{	
	 public static List<List<Integer>> combinationSum(int[] candidates, int target) 
	 {
		 List<List<Integer>> all = new ArrayList<>();
		 backTrack(all, new ArrayList<Integer>(), candidates, target, 0);	
		 all.stream().forEach(System.out::println);
		 return all;
	 }
	 
	 public static void backTrack( List<List<Integer>> all, List<Integer> current, int[] candidates, int target, int start) 
	 {		 
		 if(target == 0) 
		 {
			 all.add(new ArrayList<>(current));
			 return;
		 }		
		 for(int i=start; i < candidates.length; i++ ) 
		 {
			 if(candidates[i] <= target) 
			 {
				 current.add(candidates[i]);
				 backTrack(all, current, candidates, target-candidates[i], i);			 
				 current.remove(current.size()-1);
			 }
		 }
	 }

	 public static void main(String[] args) 
	 {
		 combinationSum(new int[] {2,3,4,6}, 8);
	 }
}
