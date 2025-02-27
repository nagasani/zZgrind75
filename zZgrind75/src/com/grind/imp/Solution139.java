package com.grind.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Revisit
//https://www.youtube.com/watch?v=Sx9NNgInc3A
class Solution139 
{
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean check = true;       
        while(check)
        {
        	String s1 = s;
        	List<String> removed = new ArrayList<>();
        	for(String word : wordDict) {  
        		int len = s.length();
        		s = s.replaceFirst(word, ""); 
        		if(s.length() < len) {removed.add(word);}
        		System.out.println(s);
        	}
			if(s.length() ==0) {return true;}
			else 
			{
				if(removed.isEmpty()) {return false;}
				else 
				{
					if(s.length() > 0)
					wordDict.removeAll(removed);
					s=s1;
					check =true;
				}
			}
        }
        return false;
    }
    
    public static boolean wordBreak1(String s, List<String> wordDict) {
    	int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string is always valid

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
    
    public boolean wordBreakNeetCode(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[n] = true; // Initialize the last position as true

        for (int i = n - 1; i >= 0; i--) {
            for (String word : wordDict) {
                int wordLen = word.length();
                if (i + wordLen <= n && s.substring(i, i + wordLen).equals(word) && dp[i + wordLen]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
    
    
    public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("car");
		lst.add("ca");
		lst.add("rs");
		System.out.println(wordBreak1("cars", lst));
	}
}