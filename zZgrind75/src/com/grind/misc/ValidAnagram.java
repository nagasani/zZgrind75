package com.grind.misc;

import java.util.Stack;

class ValidAnagram 
{
	
	public static void main(String[] args) {
		
		System.out.println(isValid("()[]{}"));
		
	}
	
    public static boolean isValid(String s) {
    	
    	char[] cAll = s.toCharArray();
    	
    	Stack<Character> stack  = new Stack<>();
    	
    	for(Character c : cAll) {
    		//System.out.println(" ----> "+stack.peek());
    		if(!stack.isEmpty() && ((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']'))) {
    			 //System.out.println("Here");
    			stack.pop();
    		}
    		else {
    			stack.push(c);
    		}
    		// stack.stream().forEach(System.out::print);
    		// System.out.println();
    	}
    	if(stack.isEmpty()) {
    		return true;
    	}
    	else {
    		return false;
    	}    	
    }
}