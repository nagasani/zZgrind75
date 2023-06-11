package com.grind.imp;
class Solution67 
{
	// 1111  11
	public static String addBinary(String a, String b) {
	    
		char[] c1 = a.toCharArray();
    	char[] c2 = b.toCharArray();
    	if(c1.length > c2.length) {
    		return addBinaryCalc(c1, c2);
    	}
    	else {
    		return addBinaryCalc(c2, c1);
    	}    	
	}
	
    public static String addBinaryCalc(char[] c1, char[] c2) {
    	    	
    	char[] c = new char[Math.max(c1.length, c2.length)];
    	int index = c1.length-1;
    	boolean carry = false;    	
		for(int i=c2.length-1; i >= 0; i--) 
		{
			if(c1[index] == '0' && c2[i] == '0') {
				c[index] = carry? '1' :'0';
				index--;
				carry = false;
			}
			else if((c1[index] == '1' && c2[i] == '0') || (c1[index] == '0' && c2[i] == '1')) {
				c[index] = carry ? '0' :'1';
				carry = c[index] == '0' ? true:false;
				index--;				
			}
			else if(c1[index] == '1' && c2[i] == '1') {
				c[index] = carry? '1':'0';
				index--;
				carry = true;
			}
		}
		for(int i=index; i >= 0; i--) 
		{
			if(c1[i] == '1' ) {
				c[index] = carry ? '0' : '1';
				carry = c[index] == '0' ? true:false;
				index--;				
			}
			else 
			{
				c[index] = carry? '1' :'0';
				index--;
				carry = false;
			}
		}		
        return carry? '1'+(new String(c)) : (new String(c));
    }
    
    public String addBinary1(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            int digit = sum % 2;
            carry = sum / 2;

            sb.insert(0, digit);

            i--;
            j--;
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}
}