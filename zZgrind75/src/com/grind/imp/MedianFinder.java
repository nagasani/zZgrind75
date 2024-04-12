package com.grind.imp;

import java.util.PriorityQueue;

class MedianFinder {

	private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    
    public MedianFinder() {
    	maxHeap = new PriorityQueue<Integer>();
    	minHeap = new PriorityQueue<Integer>((x,y)-> y-x);    	
    }
    
    public void addNum(int num) {
        if(maxHeap.size() == minHeap.size()) {
        	maxHeap.offer(num);
        	minHeap.offer(maxHeap.poll());
        }
        else {
        	minHeap.offer(num);
        	maxHeap.offer(minHeap.peek());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()) {
        	return minHeap.peek()+maxHeap.peek()/2.0;
        }
        else {
        	return minHeap.peek();
        }
    }
    
    public static void main(String[] args) {
    	
    	
		
	}
}