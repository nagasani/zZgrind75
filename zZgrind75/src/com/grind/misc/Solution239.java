package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution239 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
    	int i = 0;
    	int j= 0;
    	int[] result = new int[nums.length-k+1];
    	List<Integer> list = new ArrayList<>();    	
    	while(j < nums.length-k+1) 
    	{
    		while(list.size() < k) 
    		{
    			list.add(nums[i]);
    			i++;
    		}
    		int max = Collections.max(list);
    		result[j] = max;
    		list.remove(0); 
    		j++;
    	}    	
    	return result;
    }
    
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0; // Index for result array

        // Create a deque to store indices of elements in the current window.
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window from the front of the deque.
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements from the back of the deque since they can't be the max in the window.
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the back of the deque.
            deque.offer(i);

            // Add the maximum element of the current window to the result array.
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }

        return result;
    }
    
    public static void main(String[] args) 
    {
		System.out.println(maxSlidingWindow1(new int[] {1,3,-1,-3,5,3,6,7}, 3));
	}
}