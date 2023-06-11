package com.grind.imp;

import java.util.Optional;
import java.util.Stack;

public class Solution155 {
	
	public static void main(String[] args) {
		
		MinStack min = new Solution155().new MinStack();
		min.push(3);
		min.push(10);
		min.push(2);
		min.push(15);
		min.push(8);
		System.out.println(min.getMin());
		
	}
	
	public class MinStack {
	    private Stack<Integer> stack;
	    private Stack<Integer> minStack;

	    /** initialize your data structure here. */
	    public MinStack() {
	        stack = new Stack<>();
	        minStack = new Stack<>();
	    }

	    public void push(int val) {
	        stack.push(val);
	        if (minStack.isEmpty() || val <= minStack.peek()) {
	            minStack.push(val);
	        }
	    }

	    public void pop() {
	        if (stack.pop().equals(minStack.peek())) {
	            minStack.pop();
	        }
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return minStack.peek();
	    }
	}


	class MinStack1 {
		
		Stack<Integer> stack;		

		public MinStack1() {
			stack = new Stack<>();
		}

		public void push(int val) {
			stack.push(val);
			
		}

		public void pop() {
			stack.pop();
		}

		public int top() {
			return stack.peek();
		}

		public int getMin() {				
			return stack.stream().min(Integer::compareTo).get();
		}
	}
}
