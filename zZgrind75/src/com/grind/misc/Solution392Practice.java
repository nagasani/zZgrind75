package com.grind.misc;

import java.util.Arrays;
import java.util.List;

class Solution392Practice 
{
    public static boolean isSubsequence1(String s, String t) 
    {
    	if(s.length() > t.length()) {
    		return false;
    	}
    	
    	int[] a = new int[26];
    	char[] c = s.toCharArray();    	
    	for(int i=0; i < c.length; i++) {
    		System.out.println(c[i]-'a');
    		a[c[i]-'a']++;    		
    	}
    	
    	char[] c1 = t.toCharArray();    	
    	for(int i=0; i < c1.length; i++) 
    	{
    		System.out.println(c1[i]-'a');
			if(a[c1[i]-'a'] > 0) 
			{
				a[c1[i]-'a']--; 
			}      		  
    	}
    	
    	for(int i : a) {
    		if(i>0){
    			return false;
    		}
    	}    	
    	return true;    	
    }
    
  
    
    
    public static void main(String[] args) {
		System.out.println(isSubsequence1("low","hello"));
	}
}
