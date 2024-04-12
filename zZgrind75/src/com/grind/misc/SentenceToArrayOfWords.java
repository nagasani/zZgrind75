package com.grind.misc;

public class SentenceToArrayOfWords {

	
	public static void main(String[] args) {
		
		String s = "Hellow World.";
		String[] s1 = s.split("\\s+");
		for(String s2 : s1) {
			
			System.out.println(s2);
			
		}
	}
}
