package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class BackTrackTrick {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};	
		List<List<Integer>> lst = new ArrayList<>();
		lst = backTrack(lst, new ArrayList<Integer>(), nums);			
		for(List<Integer> l: lst) {
			System.out.println(l);
		}
	}

	private static List<List<Integer>> backTrack(List<List<Integer>> lst, ArrayList<Integer> currentList, int[] nums) {
		if(currentList.size() == nums.length) {
			List<Integer> copiedList = new ArrayList<>();
			copiedList.addAll(currentList);
			lst.add(copiedList);
			//System.out.println(currentList);
			return lst;
		}		
		for(int number : nums) {
			if(currentList.contains(number)) {
				continue;
			}
			currentList.add(number);
			backTrack(lst, currentList, nums);
			currentList.remove(currentList.size()-1);
		}	
		return lst;
	}
}
