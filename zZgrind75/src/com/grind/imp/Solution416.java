package com.grind.imp;

import java.util.HashSet;
import java.util.Set;

//Revisit Done
class Solution416 
{

	public boolean canPartition1(int[] nums) 
	{
		int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum is odd, it cannot be partitioned into two equal subsets.
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;
        
        for (int num : nums) {
            for (int j = targetSum; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
		
        return dp[targetSum];
	}
	
	public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If the sum is odd, we can't divide it into two equal subsets.
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        Set<Integer> possibleSums = new HashSet<>();
        possibleSums.add(0);

        for (int num : nums) {
            Set<Integer> newSums = new HashSet<>();
            for (int currentSum : possibleSums) {
                newSums.add(currentSum + num);
            }
            possibleSums.addAll(newSums);
        }

        return possibleSums.contains(target);
    }
	
	 public static void main(String[] args) {
		 Solution416 solution = new Solution416();
	        int[] nums = {1, 5, 11, 5};

	        boolean result = solution.canPartition(nums);
	        System.out.println("Can partition: " + result);
	    }
    
    
}