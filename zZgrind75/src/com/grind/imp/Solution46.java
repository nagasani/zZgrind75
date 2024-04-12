package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

//Revisit
class Solution46 
{

	
	
    private static List<List<Integer>> backtrack( List<List<Integer>> resultList, ArrayList<Integer> tempList ,int[] nums) 
    {
    	
    	if(tempList.size() == nums.length) {
    		List<Integer> copyList = new ArrayList<>(tempList.size());
            for (Integer element : tempList) {
                copyList.add(new Integer(element));
            }
            resultList.add(copyList);
    		//System.out.println(tempList);
    		return resultList;
    	}
    	for(int number : nums) {
    		
    		//Skip if we get same number
    		if(tempList.contains(number)) {
    			continue;
    		}
    		
    		//Add the new element
    		tempList.add(number);    	
    		
    		//Go back and try another element
    		resultList = backtrack(resultList, tempList, nums);
    		
    		//Remove the element
    		tempList.remove(tempList.size()-1);    		
    	}
    	for(List l : resultList) {
    		System.out.println(l);
    	}
    	return resultList;
    }
    
    public static void main(String[] args) {
    	List<List<Integer>> lst = new ArrayList<>();
		//backtrack(lst,new ArrayList<Integer>(),new int[] {1,2,3,4,5,6,7,8,9,0});
    	backtrack(lst,new ArrayList<Integer>(),new int[] {1,2,3});    	
	}
    
    //templist.add
    //backtrack(result, templist, num)
    //templist.remove(templist.size()-1)
} 