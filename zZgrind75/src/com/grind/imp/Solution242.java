package com.grind.imp;

import java.util.Arrays;
import java.util.List;

class Solution242 {
	
	public static void main(String[] args) {
		isAnagram1("hellowwwwwwwwww", "hellowwwwwwwwww");
	}
	
	public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }

        int[] count = new int[26]; // Array to count the frequency of characters

        // Increment the count for each character in string s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
       
        System.out.println(Arrays.toString(count));
        ;

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
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) {return false;}
    	char[] c1 = s.toCharArray();    
    	for(int i =0 ; i < c1.length; i++) {
    		if(t.indexOf(c1[i]) == -1) {
    			return false;
    		}
    		else {
    			t.replace(String.valueOf(c1[i]), "");
    		}
    	}        
        return true;
    }
}