package com.grind.misc;

public class SharedResource 
{
	private boolean condition = false;

	public synchronized void waitForCondition() {
		while (!condition) 
		{
			try 
			{
				wait(); // Wait until condition becomes true
			} 
			catch (InterruptedException e) 
			{
				Thread.currentThread().interrupt();
				System.out.println("Thread was interrupted.");
			}
		}
		System.out.println("Condition met, proceeding with thread.");
	}

	public synchronized void changeCondition() 
	{
		condition = true;
		notify(); // Notify waiting threads that condition has changed
	}
	
	public class MyThread implements Runnable
	{

		@Override
		public void run() 
		{
			SharedResource sd = new SharedResource();
			sd.waitForCondition();
		}
		
	}
	
	public class MyThread1 implements Runnable
	{

		@Override
		public void run() 
		{
			SharedResource sd = new SharedResource();
			sd.changeCondition();
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new SharedResource().new MyThread());
		t1.start();
		Thread t2 = new Thread(new SharedResource().new MyThread1());
		t2.start();
	}
}
