package com.grind.misc;
class Solution2108 {
    public String firstPalindrome(String[] words) 
    {
    	
    	for(String s:words) 
    	{
    	
    		char[] c = s.toCharArray();
    		
    		int left = 0;
    		int right = c.length-1;
    		
    		while(left < right) 
    		{
    			if(c[left] == c[right]) 
    			{
    				left++;
    				right--;
    				if(right -left == 1 ) 
    				{
    					return s;
    				}
    				continue;
    			}
    			else
    			{
    				break;
    			}
    		}
    	}
    	
        return null;
    }
    
    public static void main(String[] args) {
    	Solution2108 solution = new Solution2108();
        
        // Test cases
        String[] words1 = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(solution.firstPalindrome(words1)); // Output: "ada"
        
        String[] words2 = {"notapalindrome", "racecar", "cool"};
        System.out.println(solution.firstPalindrome(words2)); // Output: "racecar"
        
        String[] words3 = {"hello", "world"};
        System.out.println(solution.firstPalindrome(words3)); // Output: ""
        
        String[] words4 = {"wow", "noon", "deed"};
        System.out.println(solution.firstPalindrome(words4)); // Output: "wow"
        
        String[] words5 = {};
        System.out.println(solution.firstPalindrome(words5)); // Output: ""
    }
}