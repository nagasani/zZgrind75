package com.grind.imp;

import java.util.Stack;

//Revisit
class Solution42 
{
    public int trap(int[] height) 
    {
    	int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
    
        while(left < right) 
        {
        	if(height[left] < height[right]) 
        	{
        		if(height[left] > leftMax) 
        		{
        			leftMax = height[left];
        		}
        		else 
        		{
        			result += leftMax - height[left];
        		}        		
        		left++;
        	}
        	else 
        	{
        		 if (height[right] > rightMax) 
        		 {
                     rightMax = height[right];
                 } else 
                 {
                     result += rightMax - height[right];
                 }
        		right --;
        	}        	
        }
        return result;
    }
    
    
    public int trapStack(int[] height) {
        int n = height.length;
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int current = 0; current < n; current++) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();

                if (stack.isEmpty()) {
                    break; // No left boundary
                }

                int distance = current - stack.peek() - 1;
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                result += distance * boundedHeight;
            }

            stack.push(current);
        }

        return result;
    }
    
    public static void main(String[] args) {
    	Solution42 solution = new Solution42();
    	
    	System.out.println(solution.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
}