package com.grind.misc;
public class RemovePalindromicSubsequences {
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

    public static void main(String[] args) {
        RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        
        // Test cases
        String s1 = "ababa";
        System.out.println(solution.removePalindromeSub(s1)); // Output: 1
        
        String s2 = "abb";
        System.out.println(solution.removePalindromeSub(s2)); // Output: 2
        
        String s3 = "baabb";
        System.out.println(solution.removePalindromeSub(s3)); // Output: 2
        
        String s4 = "";
        System.out.println(solution.removePalindromeSub(s4)); // Output: 0
        
        String s5 = "ababb";
        System.out.println(solution.removePalindromeSub(s5)); // Output: 0
    }
}
