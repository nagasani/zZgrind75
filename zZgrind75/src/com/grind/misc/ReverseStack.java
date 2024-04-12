package com.grind.misc;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();		
		for(int i=10; i > 0; i--) 
		{
			stack.push(i);
		}		
		stack.stream().forEach(System.out::println);
		
	}
}
