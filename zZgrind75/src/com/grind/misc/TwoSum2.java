package com.grind.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum1(new int[] {1,2,3,4,5,6,7,8,9,0}, 7)));
		//System.out.println(Arrays.toString(twoSum3(new int[] {2,7,11,15}, 9)));
	}
	
	public static int[] twoSum(int[] nums, int target ) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			}
			map.put(nums[i],i);
		}		
		return null;
	}
	
	public static int[] twoSum1(int[] nums, int target ) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {i,map.get(target-nums[i])};
			}			
			map.put(nums[i], i);
		}
	
		return null;
	}
	
    public static int[] twoSum3(int[] nums, int target) {

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right)
        {
             if(nums[left]+nums[right] > target)
             {
                 right--;
             }
             else if(nums[left]+nums[right] < target)
             {
                 left ++;
             }
             else
             {
                 return new int[] {left,right};
             }
             System.out.println(right);
        }
        return new int[]{};
     }
}