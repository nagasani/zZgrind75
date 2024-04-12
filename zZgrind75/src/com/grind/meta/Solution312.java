package com.grind.meta;

import java.util.ArrayList;
import java.util.List;

class Solution312 
{
    public int maxCoins(int[] nums) 
    {
        //List<Integer> lst = Arrays.stream(nums).boxed().toList();
    	// List<Integer> lst = Arrays.asList(ArrayUtils.toObject(nums));
    	// Manually convert the array to a List
         
    	List<Integer> lst = new ArrayList<>();
         for (int num : nums) {
        	 lst.add(num);
         } 
        int result = 0;
        while(!lst.isEmpty()) 
        {
        	int size = lst.size();
        	int index = 0;
        	int mid = size/2;
        	if(size%2 == 0) 
        	{        		
        		index = Math.min(lst.get(mid-1), lst.get(mid-2));        		
        	}
        	else 
        	{
        		index = mid-1;  
        	}
        	result += (index-1 < 0 ? 1 :lst.get(index-1)) * lst.get(index) * (index+1 > size ? 1 :lst.get(index+1));
        	lst.remove(index-1);
        }        
        return result;
    }
}