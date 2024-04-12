package com.grind.misc;

import java.util.Stack;

class Solution1221 
{
    public int balancedStringSplit(String s) 
    {
    	Stack<Character> stack = new Stack<>(); 
    	int count = 0;
    	Character charToBalance = s.charAt(0) == 'R' ? 'L' : 'R';
    	for(int i=0; i < s.length(); i++) 
    	{    
    		Character c = s.charAt(i);
    		if(c != charToBalance) 
    		{
    			stack.push(charToBalance);
    		}
    		else 
    		{
    			stack.pop();
    		}
    		if(stack.isEmpty()) 
    		{
    			charToBalance = s.charAt(i) == 'R' ? 'L' : 'R';
    			count++;
    		}
    	}    	
        return count;
    }
}