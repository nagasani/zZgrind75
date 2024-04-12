package com.grind.misc;

import java.util.LinkedList;

public class Buffer1 
{
	private int capacity;
	LinkedList<Integer> buf = new LinkedList<>();
	
	public Buffer1(int capacity) 
	{
		this.capacity = capacity;
	}
	
	public synchronized void consume(int val) throws InterruptedException 
	{
		while(buf.size() == capacity) 
		{
			wait();
		}
		buf.add(val);
		System.out.println("Consumed: " + val);
		notifyAll();		
	}
	
	public synchronized void produce() throws InterruptedException 
	{
		while(buf.size() == 0) 
		{
			wait();
		}
		int val = buf.removeFirst();
		System.out.println("Produced: " + val);
		notifyAll();		
	}
	
}
