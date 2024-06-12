package com.grind.misc;
class Solution29 {
    public int divide(int dividend, int divisor) 
    {
        int quotient = 0;
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
        {
        	
            if(dividend < 0 && divisor < 0)
            {
                dividend = dividend < 0 ? -dividend : dividend;
                divisor = divisor < 0 ? -divisor : divisor; 
            }
            while(dividend - divisor >= 0)
            {
                dividend -= divisor;
                quotient++;
                if(dividend == 0)break;
            }
        }
        else
        {
            dividend = dividend < 0 ? -dividend : dividend;
            divisor = divisor < 0 ? -divisor : divisor;
            System.out.println("dividend "+dividend);
            System.out.println("divisor "+divisor);
            while((dividend - divisor) >= 0)
            {
                dividend -= divisor;
                quotient++;
                if(dividend == 0)break;
            }
            quotient = -quotient;           
        }
        return quotient;
    }
}