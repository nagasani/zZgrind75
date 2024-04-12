package com.grind.misc;

public class ConvertStringToInt {
	
	public static void main(String[] args) {
		String s = "132";			
		int num = 0;
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			num = num * 10 + Integer.parseInt(Character.toString(c));	
			System.out.println(num);
		}
		
	}

}

//12
//10+2