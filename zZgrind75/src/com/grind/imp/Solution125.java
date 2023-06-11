package com.grind.imp;
class Solution125 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("0P"));
	}
	
    public static boolean isPalindrome(String s) {
     
    	char[] c = (s.toLowerCase()).toCharArray();
    	StringBuilder sb = new StringBuilder();
    	for(char c1:c) {
    		if((c1 >= 'a' && c1 <= 'z') ||  (c1 >= '0' && c1 <= '9')) {
    			sb.append(c1);
    		}    		
    	}
    	System.out.println(sb.toString());
    	System.out.println(sb.reverse().toString());    	
    	return sb.toString().equalsIgnoreCase((sb.reverse().toString())) ? true : false;
    }
    
    public static boolean isPalindromeAnotherSol(String s) {
        
   	 String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            // Compare characters from the left and right pointers
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
   }
}