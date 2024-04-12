package com.grind.zip;

import java.util.HashSet;
import java.util.Set;

//Longest SubString Without repeating Characters.
//Logic Here is i and j will scann the elements and find the best from the set. 
//User a collection to decide the best
public class SldingWindowExample {
	
	public static String getSub(String s) {
		
		int i =0;
		int j = 0;
		String sub = "";
		Set<Character> set = new HashSet<>();
		while(j < s.length()) 
		{
			Character c = s.charAt(j);			
			while(set.contains(c)) 
			{
				Character c1 = s.charAt(i);
				set.remove(c1);
				i++;
			}
			if(sub.length() < (j-i)+1) {
				sub = s.substring(i,j+1);
			}
			set.add(c);
			j++;
		}		
		return sub;
	}
	
	public static void main(String[] args) {
		System.out.println(getSub("PWWKEW"));		
		System.out.println(getSub("PWWKEWASDFGHJKLG"));		
	}

}
