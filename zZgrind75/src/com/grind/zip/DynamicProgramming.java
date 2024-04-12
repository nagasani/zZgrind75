package com.grind.zip;

import java.util.HashSet;
import java.util.Set;

//Leetcode 416 [1,5,11,5]
public class DynamicProgramming {
	
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
	

}
