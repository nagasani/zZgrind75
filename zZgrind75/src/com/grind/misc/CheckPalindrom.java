package com.grind.misc;

public class CheckPalindrom {
	
	public static boolean validPalindrom(String s) {
		
		int left =0;
		int right = s.length()-1;
		
		while(left < right) {
			//System.out.println(s.charAt(left)+" :"+s.charAt(right));
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(validPalindrom("BABABA"));
	}

}
