package com.grind.misc;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class BiConsureExample {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bc = (x,y) -> System.out.println(x+y);
		
		bc.accept(5, 5);
		
		Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
		
		CrateFunctionalInterface ci = Temp122 :: testImplementation;
		ci.funcInt();
		
		
		CrateFunctionalInterface ci1 = () -> {System.out.println("Lamda Implementation");};
		
		ci1.funcInt();
		
	}

	
	class Temp122 
	{
		public static void testImplementation() 
		{
			System.out.println("Implmentation");
		}
	}
}
