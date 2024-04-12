package com.grind.misc;

public class AnagramChecker {
	
	public static void main(String[] args) {
		System.out.println(checkAnagrams("abcf","bcad"));
	}

	private static boolean checkAnagrams(String string, String string2) 
	{
		
		if(string.length() != string2.length()) {
			return false;
		}
		int[] i = new int[26];
		
		for(char c: string.toCharArray()) {
			i[c - 'a']++;
		}
		
		for(char c: string2.toCharArray()) {
			i[c - 'a']--;
		}
		
		for(int k=0; k < i.length; k++) {
			if(i[k] > 0 ) {
				return false;
			}
		}
		return true;		
	}
}
