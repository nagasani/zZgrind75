package com.grind.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1200
{
    public static List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
    	Arrays.sort(arr);
    	List<List<Integer>> lst = new ArrayList<List<Integer>>();
    	
    	int min = Integer.MAX_VALUE;
    	for(int i= 0; i < arr.length; i++) 
    	{
    		for(int j= i+1; j < arr.length; j++) 
    		{
    			int diff = Math.abs(arr[i] - arr[j]);
    			if(min == diff) {
    				lst.add(List.of(arr[i], arr[j]));
    				min = diff;
    			}
    			else if(diff < min) {
    				lst.clear();
    				lst.add(List.of(arr[i], arr[j]));
    				min = diff;
    			}
    		}
    	}
        return lst;
    }
    
    public static List<List<Integer>> minimumAbsDifference1(int[] arr) 
    {
    	Arrays.sort(arr);
    	int min = Integer.MAX_VALUE;
    	for(int i=1;i<arr.length; i++) {
    		int val = Math.abs(arr[i-1] - arr[i]);
    		min = val < min ? val : min;
    	}
    	
    	List<List<Integer>> lst = new ArrayList<List<Integer>>();
    	for(int i=1;i<arr.length; i++) {
    		int val = Math.abs(arr[i-1] - arr[i]);
    		if(val == min) {
    			lst.add(List.of(arr[i-1] , arr[i]));
    		}
    	}	
        return lst;
    }
    
    public static void main(String[] args) {
    	minimumAbsDifference1(new int[] {4,2,1,3});
	}
}