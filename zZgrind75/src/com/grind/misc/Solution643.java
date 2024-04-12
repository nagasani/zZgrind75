package com.grind.misc;
class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
    	
    	int sum =0;
    	for(int i=0; i < k; i++) {
    		sum+= nums[i];
    	}
    	
    	int max = sum;
    	int left=0;
    	int right=k;
    	
    	while(right < nums.length) {
    		
    		sum -= nums[left];
    		left++;
    		
    		sum += nums[right];
    		right++;
    		
    		max = Math.max(max, sum);
    		
    	}
    	    	
        return (double)max/k;
    }
}