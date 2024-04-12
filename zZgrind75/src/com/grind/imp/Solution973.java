package com.grind.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class Solution973 {
	
	    public int[][] kClosest(int[][] points, int K) {
	        // Create a min-heap (priority queue) to store points sorted by distance
	        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> 
	            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
	        
	        // Insert each point into the min-heap
	        for (int[] point : points) {
	            minHeap.offer(point);
	            
	            // If the size of the min-heap exceeds K, remove the point with the maximum distance
	            if (minHeap.size() > K) {
	                minHeap.poll();
	            }
	        }
	        
	        // Extract the K closest points from the min-heap
	        int[][] result = new int[K][2];
	        while (K > 0) {
	            result[--K] = minHeap.poll();
	        }
	        
	        return result;
	    }

    public int[][] kClosest1(int[][] points, int k) 
    {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<points.length; i++)
        {
            double d = Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));  
            map.putIfAbsent((int)d, new ArrayList<Integer>());
            if(map.containsKey((int)d)) 
            {
            	map.get((int)d).add(points[i][0]);
            	map.get((int)d).add(points[i][1]);
            }
        } 
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int j =0;
        int[][] tmp = new int[k][2];
        for(int l=0; l < k; l++) 
        {
        	List<Integer> lst = map.get(l);
        	if(j==k) {break;}
        	for(int m=0; m < lst.size(); m++) 
        	{
        		tmp[j][0]= lst.get(m);
        		tmp[j][0]= lst.get(m++);
        		j++;
        	}
        }
        return tmp;
    }
}