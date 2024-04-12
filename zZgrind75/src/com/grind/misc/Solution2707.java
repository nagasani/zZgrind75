package com.grind.misc;

class Solution2707 
{
    public int minExtraChar(String s, String[] dictionary) 
    {
        int i=0;
        int j=0;
        int min = 0;
        while(j < s.length())
        {
            String s1 = s.substring(i,j+1);
            //if(dictionary) {}
            System.out.println(s1);
            j++;
        }
        return min;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution2707().minExtraChar("leetscode", new String[]{"leet","code","leetcode"}));
	}
}