package com.grind.imp;

import java.util.Stack;

//Review
class Solution224 
{
	/*
	Input: tokens = ["2","1","+","3","*"]
	Output: 9
	Explanation: ((2 + 1) * 3) = 9
	Example 2:

	Input: tokens = ["4","13","5","/","+"]
	Output: 6
	Explanation: (4 + (13 / 5)) = 6
	Example 3:

	Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
	Output: 22
	Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
	= ((10 * (6 / (12 * -11))) + 17) + 5
	= ((10 * (6 / -132)) + 17) + 5
	= ((10 * 0) + 17) + 5
	= (0 + 17) + 5
	= 17 + 5
	= 22
	*/
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.matches("-?\\d+")) { // Check if the token is an operand
                stack.push(Integer.parseInt(token));
            } else { // Token is an operator
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        return stack.pop();
    }
	public static int evalRPN1(String[] tokens) {
		
		 Stack<String> stack = new Stack<>();
	        int result = 0;	       

	        for (int i = tokens.length-1; i > -1; i--) 
	        {
	        	String s = tokens[i];
	        	if(isInteger(s)) 
	        	{
	        		if(isInteger(stack.peek())) 
	        		{
	        			int num = Integer.parseInt(stack.pop());
	        			String sign = stack.pop();
    					if(sign == "+") 
    		        	{
    						 result = num + Integer.parseInt(s);
    		        	}
    		        	else if(sign == "-") 
    		        	{
    		        		result = num - Integer.parseInt(s);
    		        	}
    		        	else if(sign == "*") 
    		        	{
    		        		result = num * Integer.parseInt(s);
    		        	}
    		        	else if(sign == "/") 
    		        	{
    		        		result = num / Integer.parseInt(s);
    		        	}
    					stack.push(Integer.toString(result));
	        		}
	        		else
	        		{
	        			stack.push(s);
	        		}
	        	}
	        	else 
	        	{
	        		stack.push(s);
	        	}
	        }	        
	 
		return Integer.parseInt(stack.pop());
	}
	//2-1 + 2 
	public int calculate(String s) 
	{
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        return result + (sign * num);
    }
	
	public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	public static void main(String[] args) {
		//evalRPN(new String[] {"2","1","+","3","*"});
	}
}