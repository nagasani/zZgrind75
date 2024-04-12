package com.grind.misc;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>((x,y) -> x-y);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(0);
		set.add(3);		
		set.stream().forEach(System.out::println);		
	}
	
	class MyComparable implements Comparable<Integer>
	{
		Integer i;
		
		@Override
		public int compareTo(Integer o) 
		{
			return o-this.i;
		}		
	}
	

}
