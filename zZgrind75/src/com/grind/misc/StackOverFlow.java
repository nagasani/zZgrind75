package com.grind.misc;

public class StackOverFlow {
	static int i =0;
	
	public static void main(String[] args) {
		callAgain();
	}
	
	public static void callAgain() {
		System.out.println(i++);
		callAgain();
	}

}
