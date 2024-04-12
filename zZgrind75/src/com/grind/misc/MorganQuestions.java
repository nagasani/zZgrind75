package com.grind.misc;

import java.util.function.Predicate;

public class MorganQuestions 
{	
	public static void main(String[] args) 
	{	
		String str = "aBCdE";
		char[] c = str.toCharArray();		
		for(int i=0; i < c.length; i++) 
		{
			//Predicate<String> p1 = (s)->s.length() > 5;
			System.out.println((c[i] - 'a'));
			Predicate<Character> p1 = (c1) -> (c1 - 'a') < 0;
			if(!p1.test(c[i])) 
			{
				System.out.println(Character.toUpperCase(c[i]));
				c[i] = Character.toUpperCase(c[i]);
			}			
		}		
		System.out.println(new String(c));		
	}
}
