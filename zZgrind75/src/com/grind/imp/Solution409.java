package com.grind.imp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Solution409 
{
    public static int longestPalindrome2(String s) 
    {
    	char[] c = s.toCharArray();
    	Map<Character, Integer> map = new HashMap<>(); 
    	for(int i=0; i <c.length; i++ ) {    		
    		map.putIfAbsent(c[i], 0);
    		map.put(c[i], map.get(c[i]) + 1);
    	}
    	int val = map.values().stream().filter(x -> (x%2 == 0)).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
    	if(map.values().contains(1)) {
    		val = val+1;
    	}
    	for(int x : map.values()) {
    		if(x > val) {
    			val = x;
    		}
    	}
    	return val;
    }  
    
    public static int longestPalindrome1(String s) {
        int ans = 0;
       int[] count = new int[128];

       for (final char c : s.toCharArray())
         ++count[c];
       
       //for (final int c : count) System.out.println(c);

       for (final int c : count)
       {
    	 if(c != 0)
    	 {
    		 ans += c % 2 == 0 ? c : c - 1;
    		 System.out.println(c+" --- "+ans);
    	 }
        
       }

       final boolean hasOddCount = Arrays.stream(count).anyMatch(c -> c % 2 == 1);

       return ans + (hasOddCount ? 1 : 0);
       }
    
    public static int longestPalindrome(String s) 
    {
    	int count = 0;
    	boolean hasOdd = false;
    	char[] c = s.toCharArray();
    	Map<Character, Integer> map = new TreeMap<Character, Integer>();    	
    	for(char c1 : c) 
    	{
    		map.put(c1, map.getOrDefault(c1, 0)+1);
    	}    	
    	for(Integer i : map.values()) 
    	{    		
    		if(i%2==0)
    		{
    			count = count+i;
    			//System.out.println(i+" --- "+count);
    		}
    		else 
    		{
    			count = count+i-1;
    			hasOdd = true;
    		}
    	}
    	//System.out.println("count "+count+" -- hasOdd -- "+hasOdd);
    	return count + (hasOdd?1:0);
    }
    public static void main(String[] args) {
    	String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    	//System.out.println(longestPalindrome1(str));
    	System.out.println("**********");
    	System.out.println(longestPalindrome(str));
    }
    
    
}