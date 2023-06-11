package com.grind.imp;
class Solution121 
{
	public static void main(String[] args) {
		System.out.println(maxProfitBruteForce(new int[] {7,1,5,3,6,4}));
	}
	
	 public static int maxProfit(int[] prices) {
	    	
		 int minPrice = Integer.MAX_VALUE; // Initialize the minimum price to a very large value
	        int maxProfit = 0; // Initialize the maximum profit to zero

	        for (int i = 0; i < prices.length; i++) {
	            // If the current price is smaller than the minimum price, update the minimum price
	            if (prices[i] < minPrice) {
	                minPrice = prices[i];
	            }
	            // If the current price minus the minimum price is greater than the maximum profit, update the maximum profit
	            else if (prices[i] - minPrice > maxProfit) {
	                maxProfit = prices[i] - minPrice;
	            }
	        }
	        return maxProfit;
    }
	
    public static int maxProfitBruteForce(int[] prices) {
    	
    	int max = Integer.MIN_VALUE;
    	for(int i=0; i < prices.length; i++) 
    	{    		
    		for(int j=i+1; j < prices.length; j++) 
    		{
    			max = prices[j] - prices[i] > max ? prices[j] - prices[i] : max;        			
        	}
    	}    
        return max < 0 ? 0 : max;
    }
}