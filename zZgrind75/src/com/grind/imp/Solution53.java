package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

class Solution53 {
	
	public static int max = Integer.MIN_VALUE;
	
	public static int maxSubArray(int[] nums) 
    {
		int max_so_far = nums[0];
		int curr_max = nums[0];		
		for(int i=1; i < nums.length; i++) 
		{			
			curr_max = Math.max(nums[i], curr_max+nums[i]);
			max_so_far = Math.max(curr_max, max_so_far);
		}		
		return max_so_far;
    }
	
	public static int maxSubArrayBrutheForce(int[] nums) 
    {     
		int maximum = Integer.MIN_VALUE;
    	for(int i=0; i< nums.length; i++) 
    	{
    		int sum = nums[i];
    		maximum = Math.max(maximum, sum);
    		for(int j=i+1; j< nums.length; j++) 
    		{        	
        		sum+=nums[j];	
        		maximum = Math.max(maximum, sum);
        	}    		
        }
    	return nums.length ==1 ? nums[0] : maximum;
    }
	
    public static int maxSubArray1(int[] nums) 
    {          
    	backTrack(new ArrayList<>(),nums, 0);    	
        return max;
    }
    
    public static void backTrack(List<Integer> current, int[] nums, int start) 
    {
    	max = Math.max(max, listSum(current));
    	for(int i=start; i < nums.length; i++) 
    	{    		
    		current.add(nums[i]);
    		backTrack(current, nums, i+1);
    		//current.remove(current.size()-1);    		    	
    	}       
    }
    
    public static int listSum(List<Integer> numsSub) 
    {        	
    	return numsSub.stream().mapToInt(Integer::intValue).sum();  	
    }
    
    public static void main(String[] args) {
    	System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    	System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));
    	System.out.println(maxSubArray(new int[] {1}));


	}
}