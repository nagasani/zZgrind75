package com.grind.misc;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

	
	public static void main(String[] args) {
		
		Predicate<String> p1 = (s)->s.length() > 5;
		
		System.out.println("Length more than 5 "+p1.test("Rama Raju"));
		
		Predicate<String> p2 = (s)->s.length()%2 == 0;
		
		System.out.println("Length is even "+p2.test("Rama Raju"));
		
		Function<Integer, Integer> fun = i -> i*i;
		
		System.out.println(fun.apply(8));
		
		Function<Integer, Integer> doubleIt = i -> i*2;
		
		Function<Integer, Integer> cubeIt = i -> i*i*i;
		
		
	
		System.out.println("First Double using Apply "+doubleIt.andThen(cubeIt).apply(2));
		
		System.out.println("First cube using compose "+doubleIt.compose(cubeIt).apply(2));
		
	}
	
}
