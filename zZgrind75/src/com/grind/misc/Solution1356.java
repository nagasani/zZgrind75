package com.grind.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution1356 {
    public static int[] sortByBits(int[] arr) {
    	
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	for(int i =0; i < arr.length; i++) {
    		List<Integer> lst = null;
    		if(map.get(Integer.bitCount(arr[i])) == null) {
    			lst = new ArrayList<>();
    		}
    		else {
    			lst = map.get(Integer.bitCount(arr[i]));
    		}
    		lst.add(arr[i]);
    		map.putIfAbsent(Integer.bitCount(arr[i]), lst);
    	}
    	Set<Integer> set = map.keySet();
    	Collections.sort(new ArrayList<>(set));
    	int[] result = new int[arr.length];
    	int index=0;
    	for(Integer j : set) {
    		List<Integer> lst = map.get(j);
    		Collections.sort(lst);
    		for(Integer k: lst) {
    			result[index] = k;
    			index++;
    		}
    	}
    	//System.out.println(Arrays.stream(result).map(x->x).boxed().collect(Collectors.toList()));;
        return result;
    }
    
    
    public int[] sortByBits1(int[] arr) {
        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        Arrays.sort(sortedArr, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA != countB) {
                return countA - countB;
            } else {
                return a - b;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArr[i];
        }

        return arr;
    }
    
    public static void main(String[] args) {
		sortByBits(new int[] {0,1,2,3,4,5,6,7,8});
		sortByBits(new int[] {1024,512,256,128,64,32,16,8,4,2,1});
	}
}