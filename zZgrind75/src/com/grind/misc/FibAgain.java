package com.grind.misc;

public class FibAgain {

	public static void main(String[] args) {
		System.out.println(fibCalc(10));
	}
	
	public static int fibCalc(int n) 
	{
		int[] fibArray = new int[n];
		fibArray[0]=0;
		fibArray[1]=1;
		
		for(int i=2; i < n; i++) {
			fibArray[i]=fibArray[i-1]+fibArray[i-2]; 
		}
		
		
		return fibArray[n-1];
	}
}
