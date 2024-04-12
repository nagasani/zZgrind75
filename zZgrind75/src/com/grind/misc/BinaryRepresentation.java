package com.grind.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BinaryRepresentation {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter : ");
		
		String n = scanner.next();
		
		System.out.println("You have entered : "+n);
		
		getMinBinaryNum(Integer.parseInt(n));
		
	}

	public static List<Integer> getMinBinaryNum(int n)
	{
		List<Integer> lst = new ArrayList<Integer>();
		System.out.println(n);
		int charCount = n/10;
		charCount = charCount +1;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 1);
		map.put(2, 11);
		map.put(3, 111);
		map.put(4, 1111);
		map.put(5, 11111);
		map.put(6, 111111);
		
		while(charCount > 0) 
		{
			while(n >= map.get(charCount)) 
			{
				n = n - map.get(charCount);
				lst.add(map.get(charCount));
				System.out.println(map.get(charCount));				
				charCount = n/10;
				charCount = charCount +1;				
			}			
			charCount --;
		}		
		return null;
	}
}
