package com.grind.misc;

public class FibSeries {
	
	public static void main(String[] args) {
		
		int[] fib = new int[11]; 
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2 ; i < fib.length; i++) {
			fib[i] = fib[i-1]+fib[i-2];
		//	System.out.println(fib[i]);
		}
		System.out.println(fibRec(10));
		
	}
	
	public static int fibRec(int n) {
		if(n <= 1) {
			return n;
		}		
		return fibRec(n-1) + fibRec(n-2);		
	}	
}
