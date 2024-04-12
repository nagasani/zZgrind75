package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

class Solution54545454 
{
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> lst = new ArrayList<>();
       lst = backtrack(lst,new ArrayList<Integer>(),nums);
       for(List l:lst) {
    	   System.out.println(l);
       }
       return lst;
    }

    private static List<List<Integer>> backtrack( List<List<Integer>> resultList, ArrayList<Integer>tempList ,int[] nums) 
    {
    	
    	if(tempList.size() == nums.length) {
    		resultList.add(tempList);    		    		
    	}
    	for(int number : nums) {
    		
    		//Skip if we get same number
    		if(tempList.contains(number)) {
    			continue;
    		}
    		
    		//Add the new element
    		tempList.add(number);    	
    		
    		//Go back and try another element
    		backtrack(resultList, tempList, nums);
    		
    		//Remove the element
    		tempList.remove(tempList.size()-1);    		
    	} 
    	return resultList;
    }
    
}