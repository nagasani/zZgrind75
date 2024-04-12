package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStartStopThread
{
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyStartStopThread().new MyThreadRunnable());		
		t1.start();
		//t1.stop();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MyStartStopThread().new MyThreadRunnable().requestStop();
		List<String> lst = new ArrayList<>();
		Collections.synchronizedList(lst);
	}
	
	public class MyThreadRunnable implements Runnable 
	{
		
		private boolean stopRequested = false;
		
		public synchronized void requestStop () {
			this.stopRequested = true;
		}
		
		public synchronized boolean isStopRequested () {
			return this.stopRequested;
		}
		
		private void sleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			System.out.println("StoppableRunnable is Running");
			while(!stopRequested) 
			{
				sleep(10000);
				System.out.println("...");
			}
			System.out.println("StoppalbleRunnalbe is Stopped");
		}		
	}

}
