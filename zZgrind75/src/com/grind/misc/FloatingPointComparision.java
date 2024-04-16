package com.grind.misc;

public class FloatingPointComparision {
	
	public static void main(String[] args) {
		System.out.println(3*0.1);
		System.out.println(0.1*3);
		System.out.println(3*0.01);
		if(3*0.1==0.3) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(Math.abs(3*0.1 - 0.03));
		if(Math.abs(3*0.1 - 0.03) < 0.1) 
		{
			System.out.println("true");
		}
	}

}
