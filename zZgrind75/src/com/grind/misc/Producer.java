package com.grind.misc;

public class Producer extends Thread 
{
	private Buffer buffer;

	public Producer(Buffer buffer) 
	{
		this.buffer = buffer;
	}

	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			try 
			{
				buffer.produce(i);
				Thread.sleep(100); // Simulate time taken to produce the item
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
