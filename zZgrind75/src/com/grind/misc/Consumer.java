package com.grind.misc;

public class Consumer extends Thread 
{
	private Buffer buffer;

	public Consumer(Buffer buffer) 
	{
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) 
		{
			try 
			{
				buffer.consume();
				Thread.sleep(100); // Simulate time taken to consume the item
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
