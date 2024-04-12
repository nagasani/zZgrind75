package com.grind.misc;

public class CheckIfBothStringsExists {
	
	
	public static void main(String[] args) {
		String s1 = "abcl";
		String s2 = "abrfcs";
		
		String s = "abcdfabrfcs";
		
		int[] count  = new int[26];
		
		System.out.println(s.charAt(0) - 'a');
		
		for(char c : s.toCharArray()) 
		{
			count[c - 'a']++;
		}
		
		for(char c1 : (s1+s2).toCharArray()) 
		{
			if(count[c1-'a'] == 0) 
			{
				System.out.println("Not the right : "+c1);
				break;
			}
			else 
			{
				count[c1-'a']--;
			}			
		}		
	}

}
