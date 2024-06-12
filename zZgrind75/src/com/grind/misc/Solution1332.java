package com.grind.misc;
class Solution1332 {

     public int removePalindromeSub1(String s) {
        
        char[] c = s.toCharArray();
        int count = 1;
        int left = 0;
        int right = c.length-1;
        while(left < right)
        {   
            if(c[left] == c[right])
            {
                left++;
                right--;
                continue;
            }
            else if(c[left] != c[left+1])
            {
                left++;                
            }
            else if(c[right] != c[right-1])
            {
                right--;                
            }
            count++;
        }
        return count;
    }

   
    public int removePalindromeSub(String s) {
        // If the string is empty, return 0 steps.
        if (s.isEmpty()) {
            return 0;
        }
        // Check if the string is a palindrome.
        if (isPalindrome(s)) {
            return 1;
        }
        // If it's not a palindrome, it will take 2 steps.
        return 2;
    }

    // Helper method to check if a string is a palindrome.
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}