package com.grind.misc;

public class ChangingForLoop {

	public static void main(String[] args) {
		
		int k = 10;
		for(int i = 0; i < k; i++ ) {
			System.out.println(i);
			if(i == 5) {
				k = 2;
			}
		}
	}
}
