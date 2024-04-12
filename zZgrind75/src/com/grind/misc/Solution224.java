package com.grind.misc;

import java.util.Stack;

public class Solution224 {
	
	public static void main(String[] args) {
		
		String s = "12+25+51-1";
		int n = 0;
		int result = 0;
		char lastSign = '+';
		Stack<Integer> stack = new Stack<>();
		for(int i =0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				n =(n*10)+Integer.parseInt(Character.toString(c));
			}
			else if(c =='+')
			{
				lastSign = c;				
				n = 0;
			}
			else if(c =='-')
			{
				lastSign = c;
				n = 0;
			}
			else if(c =='(')
			{
				System.out.println(n);
				n = 0;
			}
			else if(c ==')')
			{
				System.out.println(n);
				n = 0;
			}
		}
		System.out.println(n);
		System.out.println("Result "+ (lastSign == '+' ? (result+n) : (result -n)));
	}

}
