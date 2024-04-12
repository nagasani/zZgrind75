package com.grind.meta;

import java.util.Stack;

//'(', ')', '{', '}', '[' and ']'
class Solution20 
{
    public boolean isValid(String s) {
    	char[] c = s.toCharArray();
    	Stack<Character> stack = new Stack<>();
    	for(char c1 : c) 
    	{
    		if(c1 == '(' || c1 == '{' || c1 == '[') 
    		{
    			stack.push(c1);
    		}
    		else 
    		{
    			if(stack.peek() == c1) 
    			{
    				stack.pop();
    			}
    			else 
    			{
    				return false;
    			}
    		}
    		
    	}
    	if(!stack.isEmpty()) 
		{
			return false;
		}
    	else {
    		return true;
    	}        
    }
}