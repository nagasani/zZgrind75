package com.grind.misc;

import java.util.LinkedList;

public class Buffer 
{
	private LinkedList<Integer> list = new LinkedList<>();
	private int capacity;

	public Buffer(int capacity) 
	{
		this.capacity = capacity;
	}

	// Method for producers to produce and add items to the buffer
	public synchronized void produce(int value) throws InterruptedException 
	{
		while (list.size() == capacity) 
		{
			wait(); // Wait if the buffer is full
		}
		list.add(value);
		System.out.println("Produced: " + value);
		notifyAll(); // Notify the consumer that there is data to consume
	}

	// Method for consumers to consume and remove items from the buffer
	public synchronized int consume() throws InterruptedException 
	{
		while (list.size() == 0) 
		{
			wait(); // Wait if the buffer is empty
		}
		int value = list.removeFirst();
		System.out.println("Consumed: " + value);
		notifyAll(); // Notify the producer that there is space to produce
		return value;
	}
}
