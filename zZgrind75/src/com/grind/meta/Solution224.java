package com.grind.meta;

import java.util.Stack;

class Solution224 {
    //"11 + 1"
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        char[] c = s.toCharArray();
        int result = 0;
        int num = 0;
        int sign = 1;
        for(char c1 : c)
        {
            if(Character.isDigit(c1))
            {
               num = num*10+c1-'0';
            }
            else if(c1 == '+') 
            {
            	result +=sign*num;
            	num = 0;
            	sign = 1;
            }
            else if(c1 == '-') 
            {
            	result +=sign*num;
            	num = 0;
            	sign = -1;
            }
            else if(c1 == '(') 
            {
            	stack.push(result);
            	stack.push(sign);
            	sign = 1;
            	result = 0;
            }
            else if(c1 == ')') 
            {
            	result +=sign*num;
            	num =0;            	
            	result *= stack.pop();
            	result += stack.pop();
            }
        }        
        return result+(sign*num);
        
    }
}