package com.grind.meta;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1]; // The result array size.

        Deque<Integer> deque = new ArrayDeque<>(); // Store indices of elements in the current window.

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the window's range (i-k).
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements that are less than the current element from the back of the deque.
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque.
            deque.offer(i);

            // If we have processed k elements, it means we have a valid window.
            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }
}
