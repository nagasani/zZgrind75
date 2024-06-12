package com.grind.nomura;

public class JustCheck 
{	
	public static void main(String[] args) 
	{
		int n = 182;
		char[] c = Integer.toString(n).toCharArray();
		int sum = 0;
		for(char c1 : c) 
		{
			sum += c1-'0';
		}
		System.out.println(sum);
	}

}
