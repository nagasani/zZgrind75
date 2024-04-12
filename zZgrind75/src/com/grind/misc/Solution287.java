package com.grind.misc;
public class Solution287 
{
    public static int findDuplicate(int[] nums) 
    {
        int n = nums.length - 1; // Subtract 1 to get the actual value of n
        int sumOfIntegers = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int duplicate = actualSum - sumOfIntegers;
        return duplicate;
    }
    
    public static int findDuplicate1(int[] nums) 
    {
     
        int sum = 0;
        int actualSum = 0;
        for(int i=0; i < nums.length; i++) {
        	sum+=i;
        }

        
        for (int num : nums) {
            actualSum += num;
        }
       
        return actualSum-sum;
    }
    
    public static int findDuplicate287(int[] nums) 
    {
    	int slow=0, fast=0;
    	do {
    		slow = nums[slow];       //2,6,4,1,3,1,5
    		fast = nums[nums[fast]]; //0,1,2,3,4,5,6   		
    	}while(slow != fast);
     
    	slow = 0;
    	while(slow != fast) {
    		slow = nums[slow];
    		fast = nums[fast];
    	}
    	return slow;
    }
    
    public static void main(String[] args) {
		System.out.println(findDuplicate287(new int[] {2,6,4,1,3,1,5}));
	}
}
