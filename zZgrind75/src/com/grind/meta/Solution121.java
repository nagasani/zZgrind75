package com.grind.meta;
class Solution121 
{
    public int maxProfit(int[] prices) {
    	int minVal = Integer.MAX_VALUE;
    	int maxProfit = 0;
    	for(int i=0; i < prices.length; i++) 
    	{    		
    		minVal = Math.min(minVal, prices[i]);
    		maxProfit = Math.max(maxProfit, prices[i]-minVal);
    	}
    	return maxProfit;
    }
    
    public int maxProfitBruteForce(int[] prices) {
     
    	int maxProfit = 0;
    	for(int i =0; i < prices.length; i++) 
    	{
    		for(int j =i+1; j < prices.length; j++) 
    		{
    			maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        	}
    	}    	
    	return maxProfit;
    }
    
    public static void main(String[] args) {
    	Solution121 sol = new Solution121();
    	System.out.println(sol.maxProfit(new int[] {7,1,5,3,6,4}));    	
	}
}