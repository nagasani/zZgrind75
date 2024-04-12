package com.grind.misc;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	
	public static void main(String[] args) {
		//Queue<Integer> queue = new PriorityQueue<>();
		//Queue<Integer> maxQueue = new PriorityQueue<>();
		Queue<Integer> maxQueue = new PriorityQueue<>((x,y)->y-x);
		
		
		maxQueue.offer(2);
		maxQueue.offer(4);
		maxQueue.offer(8);
		maxQueue.offer(0);
		maxQueue.offer(-8);
		maxQueue.offer(9);
		
		System.out.println(maxQueue);
		System.out.println(maxQueue.peek());
		System.out.println(maxQueue);
		System.out.println(maxQueue.poll());
		System.out.println(maxQueue);
		
		
	}

}
