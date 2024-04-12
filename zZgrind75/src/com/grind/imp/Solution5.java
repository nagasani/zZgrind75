package com.grind.imp;

class Solution5 
{
    public static String longestPalindrome1(String s) {
    	
    	String palindrome = "";
    	for(int i =0; i < s.length(); i++) 
    	{
    		for(int j =i+1; j <= s.length(); j++) 
    		{
    			System.out.println(s.substring(i, j) +" ::: "+new StringBuffer(s.substring(i, j)).reverse());
    			if(s.substring(i, j).equals(new StringBuffer(s.substring(i, j)).reverse().toString())) 
    			{
    				if(palindrome.length() < s.substring(i, j).length()) {
    					palindrome =  s.substring(i, j);
    				}
    			}
    		}
    	}
    	
        return palindrome;
    }
    
    public static String longestPalindrome(String s) 
    {  	
    	int left =0;//cbbd
    	int right = s.length()-1;
    	while(left <= right) 
    	{
    		if(validPalindrom(s.substring(left, right+1))) 
    		{
    			return s.substring(left, right+1);
    		}
    		else if(s.charAt(left+1) != s.charAt(right)) 
    		{
    			left++;
    		}
    		else if(s.charAt(left) != s.charAt(right-1))
    		{
    			right--;
    		}
    		else 
    		{
    			left++;
    			right--;
    		}
    	}
        return "";
    }
    
    public static boolean validPalindrom(String s) {
		
		int left =0;
		int right = s.length()-1;
		
		while(left <= right) {
			//System.out.println(s.charAt(left)+" :"+s.charAt(right));
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}
			else {
				return false;
			}
		}
		return true;
	}
    
    public static String longestPalindromeChatGpT(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int start = 0; // Starting index of the longest palindromic substring.
        int maxLength = 1; // Length of the longest palindromic substring (minimum is 1).

        // All substrings of length 1 are palindromes.
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for substrings of length 2.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for substrings of length greater than 2.
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
    
    
    public static String longestPalindromeBest(String str) {

        if (str.length() <= 1)
          return str;

        String LPS = "";

        for (int i = 1; i < str.length(); i++) 
        {

          // Consider odd length
          int low = i;
          int high = i;
          while(str.charAt(low) == str.charAt(high)) {
            low--;
            high++;

            if (low == -1 || high == str.length())
              break;
          }

          String palindrome = str.substring(low+1, high);
          if (palindrome.length() > LPS.length()) {
            LPS = palindrome;
          }

          // Consider even length
          low = i-1;
          high = i;
          while(str.charAt(low) == str.charAt(high)) {
            low--;
            high++;

            if (low == -1 || high == str.length())
              break;
          }

          palindrome = str.substring(low+1, high);
          if (palindrome.length() > LPS.length()) {
            LPS = palindrome;
          }
        }

        return LPS;
      }
    
    public static String longestPalindromePractice(String str) {
    	 if (str.length() <= 1)
             return str;
    	
    	String longestPalindrome = "";
    	
    	for(int i=1; i < str.length(); i++) {
    		
    		int left = i;
    		int right = i;
    		
    		//Odd Palindrom
    		while(str.charAt(left) == str.charAt(right)) 
    		{
    			left--;
    			right++;
    			if(left == -1 || right == str.length()) {
    				break;
    			}
    		}
    		
    		if(longestPalindrome.length() < (right-left)) {
    			longestPalindrome = str.substring(left+1, right);
    		}
    		
    		left = i;
    		right = i-1;
    		//Even Palindrom
    		while(str.charAt(left) == str.charAt(right)) 
    		{
    			left--;
    			right++;
    			if(left == -1 || right == str.length()) {
    				break;
    			}
    		}
    		if(longestPalindrome.length() < (right-left)) {
    			longestPalindrome = str.substring(left+1, right);
    		}    		
    	}
    	
    	return longestPalindrome;
    }
    
    public static void main(String[] args) {
    	System.out.println(longestPalindromePractice("a"));
    	System.out.println(longestPalindromePractice("cbbd"));
    	System.out.println(longestPalindromePractice("babad"));
	}
}