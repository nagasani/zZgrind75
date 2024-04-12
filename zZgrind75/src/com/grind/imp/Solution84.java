package com.grind.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Revisit
//https://www.youtube.com/watch?v=2KT7SnOMbeM
//Go with NeedCode 
class Solution84 
{
    public static int largestRectangleArea1(int[] heights) 
    {
    	List<Integer> lst = new ArrayList<>();
    	int count = heights.length;
    	int max = 0;
    	for(int i =0; i < count; i++) 
    	{
    		if(heights[i] != 0) {
    			lst.add(heights[i]);
    		}
    		else {
    			max = Math.max(max, largestRectangleAreaSub(lst));
    			lst = new ArrayList<>();
    		}    		
    	}
    	max = Math.max(max, largestRectangleAreaSub(lst));
    	return max;  
    }
    
    public static int largestRectangleAreaSub(List<Integer> list) 
    {
    	Collections.sort(list); 
    	int max = 0;
    	int count = list.size();;
    	for(int i =0; i < count; i++) 
    	{    		
    		int maxNow = list.get(i) * (count -i);
    		max = Math.max(max, maxNow);
    	}
    	return max;  
    }
    
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
    
    public static void main(String[] args) {
		System.out.println(largestRectangleArea(new int[] {2,1,2}));
	}
}