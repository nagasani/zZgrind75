package com.grind.misc;

public class ThreadSleepOneSec {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		while(true) 
		{
			Thread.sleep(5);
			System.out.print(".");
			if(System.currentTimeMillis()%20 == 0) 
			{
				System.out.println();
			}
		}
		
	}

}
