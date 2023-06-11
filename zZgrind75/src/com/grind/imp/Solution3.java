package com.grind.imp;

class Solution3 
{
	// abcabcbb
	public static int lengthOfLongestSubstring1(String s) {
		if (s == null || s.equals(""))
			return 0;
		int left = 0, right = 0, max = 0;
		while (right < s.length()) {
			int index = s.indexOf(s.charAt(right), left);
			// System.out.println(index);
			if (index != right) {
				left = index + 1;
				// System.out.println("left : " +left);
			}
			max = Math.max(max, right - left + 1);
			right++;
		}
		return max;
	}
	
	
	public static int lengthOfLongestSubstring(String s) {
		
		char[] c = s.toCharArray();
		
		int right = 0;
		int left = 0;
		int max = 0;
		
		while(right < s.length()) {
			
			int index = s.indexOf(s.charAt(right), left);
			if (index != right) {
				left = index + 1;
				// System.out.println("left : " +left);
			}			
			max = Math.max(max, right-left+1);
			right++;
		}		
		return max;
	}
	
	public static void main(String[] args) {
		
	}
}