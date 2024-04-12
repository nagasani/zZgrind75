package com.grind.misc;

import java.util.Stack;

public class StackPractice {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		stack.push(-9);
		
		
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		
	}

}
