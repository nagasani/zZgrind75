package com.grind.misc;
class Solution704 
{
    public static int search(int[] nums, int target) {
        
    	
    	int left=0;
    	int right = nums.length-1;
    	
    	while(left <= right) 
    	{
    		int mid = left+ (right-left)/2;
    		if(nums[mid] == target) 
    		{
    			return mid;
    		}
    		else if(nums[mid] < target) {
    			left = mid+1;
    		}
    		else 
    		{
    			right = mid-1;
    		}    		
    	}    	
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
		
    	System.out.println(search(new int[] {1,2,3,4,5,6,7,8,9},6));
	}
}