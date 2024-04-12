package com.grind.meta;

import java.util.Map;
import java.util.TreeMap;

class Solution239_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int i=0;
        int j=0;
        int[] result  = new int[nums.length-k+1];
        Map<Integer, Integer> map = new TreeMap<>();
        while(j < nums.length)
        {
            while(map.size() < k) 
            {
            	map.put(j, nums[j]);
            	j++;
            }
            
            

        }
        return null;
    }
}