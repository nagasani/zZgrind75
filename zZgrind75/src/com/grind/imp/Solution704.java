package com.grind.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution704 {
	
	public static void main(String[] args) {
		System.out.println(search(new int[] {1,2,5,8,24}, 8));
		
		List<String> lst = new ArrayList<>();
		
		Map<String, String> map = new HashMap<>();
		
	}
    public static int search(int[] nums, int target) {
    	int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target, return the index
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }
      
}