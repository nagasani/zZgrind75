package com.grind.meta;
class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {    	
    	int start =0;
    	int end=0;
    	int mergeStartIndex = 0;
    	int mergeEndIndex = 0;
    	for(int i =0; i < intervals.length; i++) 
    	{
    		if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0]) 
    		{
    			start = Math.min(intervals[i][0], newInterval[0]);
    			mergeStartIndex = i;
    			continue;
    		}
    		if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0]) 
    		{
    			end = Math.max(intervals[i][1], newInterval[0]);
    			mergeEndIndex = i;
    			break;
    		}
    	}      	
    	if(start != 0 && end != 0) 
    	{
    		int[][] result = new int[intervals.length-mergeEndIndex - mergeStartIndex -1][2];
    		int k=0;
    		for(int i =0; i < intervals.length; i++) 
        	{
    			
    			//result
        	}    		
    	}
    	else 
    	{
    		return intervals;
    	}
    	
    	
        
    	return null;
    }
}