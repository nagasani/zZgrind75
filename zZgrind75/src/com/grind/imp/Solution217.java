package com.grind.imp;

import java.util.HashMap;
import java.util.Map;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int k = map.getOrDefault(i, 0)+1;
    		if (k > 1) return true;
            map.put(i, k);
        }
        return false;
    }
}