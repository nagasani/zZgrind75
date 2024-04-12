package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

//Revisit
class Solution438 
{
    public static List<Integer> findAnagrams(String s, String p) {
    	 
    	List<Integer> lst = new ArrayList<>();
    	for(int i =0 ; i < s.length()-p.length()+1; i++) 
    	{    		    		
        	if(isAnagram(s.substring(i,i+p.length()),p)) {
        		lst.add(i);        	
        	}
    	}
    	System.out.println(lst);
    	return lst;
    }
    
	public static boolean isAnagram(String s, String t) {
		//if (s.length() != t.length()) {
			//return false; // Anagrams must have the same length
		//}

		int[] count = new int[26]; // Array to count the frequency of characters

		// Increment the count for each character in string s
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		// Decrement the count for each character in string t
		for (int i = 0; i < t.length(); i++) {
			count[t.charAt(i) - 'a']--;
		}

		// Check if the count array contains any non-zero values
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false; // Characters frequencies don't match, not an anagram
			}
		}
		return true; // All characters frequencies match, it's an anagram
	}
	
	public static void main(String[] args) {
		findAnagrams("cbaebabacd","abc");
		findAnagrams("abab","ab");
	}
}