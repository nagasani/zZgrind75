package com.grind.misc;

class MyOwnQuestion 
{
    public int minExtraChar(String s, String dictionary) 
    {
        int i=0;
        int j=0;
        int min = 0;
        while(j < dictionary.length())
        {
            String s1 = s.substring(i,j+1);
            if(dictionary.contains(s1)) {
            	
            }
            System.out.println(s1);
            j++;
        }
        return min;
    }
    
    public static void main(String[] args) {
		System.out.println(new MyOwnQuestion().minExtraChar("leetscode", "llleetscodewww"));
	}
}