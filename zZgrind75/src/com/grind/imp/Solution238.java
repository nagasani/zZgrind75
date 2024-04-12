package com.grind.imp;

import java.util.Arrays;
import java.util.List;

class Solution238 
{
	//Notes : Mulitply from left and then right
    public static int[] productExceptSelf1(int[] nums) {
    	
    	int n = nums.length;
    	int[] result = new int[nums.length];
    	int leftProduct = 1;
    	for(int i=0; i < n; i++) { 
    		result[i] = leftProduct;
    		leftProduct *=nums[i];
    	}
    	
    	int rightProduct = 1;
    	for(int i=n-1; i >= 0; i--) {    		
    		result[i] *= rightProduct;
    		rightProduct *=nums[i];
    	}    	
    	return result;        
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate the product of all elements on the left side of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the product of all elements on the right side of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(Arrays.toString(productExceptSelf1(new int[] {1,2,3,4})));
		System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
	}
}