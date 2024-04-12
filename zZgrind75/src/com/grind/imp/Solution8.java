package com.grind.imp;

class Solution8 
{
    public int myAtoi(String s) 
    {
    	int index = 0;
        int sign = 1;
        int result = 0;

        // Remove leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Check for a sign
        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        
        // Convert digits to integer
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }
        return result * sign;        
    }
    
    
    public static void main(String[] args) {
    	
    	char[] c = "458".toCharArray();    	
    	int num = 0;    	
    	for(int i=0; i < c.length; i++) 
    	{
    		
    		System.out.println(c[i]);
    		num = num*10+(c[i]-'0');
    	}
    	
    	System.out.println(num);
	}
}