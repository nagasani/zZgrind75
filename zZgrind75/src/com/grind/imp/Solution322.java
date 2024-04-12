package com.grind.imp;

import java.util.Arrays;

class Solution322 {
    public int coinChange1(int[] coins, int amount) {
        
    	int sum =0;
    	int count =0;
    	Arrays.sort(coins);
    	
    	while (sum <= amount) {
    		
    		int reminder = amount % coins[coins.length-1];
    		if(reminder == 0) 
    		{
    			count += amount / coins[coins.length-1];
    		}
    		else {
    			
    		}
    		
    	}
    	
    	return 0;
    }
    
    public int coinChange(int[] coins, int amount) {
    	if(amount < 1) return 0;
    	int[] minCoinsDP = new int[amount+1];    
    	for(int i=1; i <= amount; i++) {    		
    		minCoinsDP[i] = Integer.MAX_VALUE;
    		
    		for(int coin : coins) {
    			if(coin <=i && minCoinsDP[i-coin] != Integer.MAX_VALUE)  {
    				minCoinsDP[i] = Math.min(minCoinsDP[i], 1+minCoinsDP[i-coin]);
    			}
    		}    		
    	}
    	return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
    }
}