package com.grind.misc;

import java.util.Arrays;
import java.util.List;

class Solution392 
{
    public static boolean isSubsequence1(String s, String t) 
    {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Iterate through both strings
        while (i < s.length() && j < t.length()) {
            // If the characters match, move the s pointer
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the t pointer
            j++;
        }

        // If all characters in s were found in t, s is a subsequence
        return i == s.length();
    }
    
    public boolean isSubsequence(String sub, String all) 
    {	
    	int i = 0;
    	int j = 0;
    	while(i < sub.length() && j < all.length() )
    	{
    		if(sub.charAt(i) == all.charAt(j)) 
    		{
    			i++;
    		}
    		j++;	
    	}
    	return i == sub.length() ? true : false;
    }
    
    public boolean isSubsequenceAgain(String sub, String full) {
    	
    	char[] c = full.toCharArray();
    	//List<Character> l = 
    			//Arrays.asList(
    	//Character[] c1 = new Characte
    	
    	//Arrays.stream(c1);
    	
    	return false;
    }
    
    public static void main(String[] args) {
		//System.out.println("Test");
		System.out.println(isSubsequence1("lo","Hello"));
	}
}
