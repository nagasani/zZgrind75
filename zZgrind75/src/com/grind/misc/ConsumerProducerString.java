package com.grind.misc;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConsumerProducerString {
	
	public static Map<Date, IntWrapper> map = new ConcurrentHashMap<>();
	
	
	public static void consume(String s) 
	{
		Date date = new Date();
		if(map.containsKey(date)) 
		{
			IntWrapper i = map.get(date);
			char[] c = s.toCharArray();
			for(char c1 : c) {
				i.l[c1-'a']++;
			}
		}			
		else 
		{
			IntWrapper intWrapper = new ConsumerProducerString().new IntWrapper();
			char[] c = s.toCharArray();
			for(char c1 : c) {
				System.out.println(c1-'a');								
				intWrapper.l[c1-'a']++;
			}
			 		     
		}		
	}
	
	public class IntWrapper{
		int[] l = new int[128];
	}
	
	public static int getCount(Date date, char c) 
	{
		return map.get(date).l[c-'a'];
	}
	
	public static void main(String[] args) {
		consume("ramarajunagasani");
		consume("aashrithanagasani");
		consume("rishirajnagasani");
		consume("nagaswapnapotteti");
		Date date = new Date();
		System.out.println(getCount(date, 'n'));
	}
	

}
