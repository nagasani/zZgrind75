package com.grind.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//[[1,3],[6,9]], newInterval = [2,5]
//Review
class Solution57 {
    public int[][] insert1(int[][] intervals, int[] newInterval) {
    	
    	List<Integer[]> lst = new ArrayList<>();
    	for(int[] i : intervals) {
    		if(i[0] > newInterval[0]) {
    			
    		}
    		else 
    		{
    			Integer[] integerArray = Arrays.stream(i).boxed().toArray(Integer[]::new);
    			lst.add(integerArray);
    		}
    		
    	}
    	
        return intervals;
    }
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        // Add intervals that come before the new interval
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add remaining intervals
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}