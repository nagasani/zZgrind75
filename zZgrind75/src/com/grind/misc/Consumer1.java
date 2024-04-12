package com.grind.misc;

public class Consumer1 implements Runnable
{

	Buffer1 buf;
	
	public Consumer1(Buffer1 buf)
	{
		this.buf = buf;
	}
	
	@Override
	public void run() 
	{
		try 
		{
			for(int i = 0; i < 10; i++) 
			{
				buf.consume(i);
				Thread.sleep(100);
			}			
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
}
