package com.grind.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(30);
		list.add(12);
		list.add(19);
		
		List<Integer> listFiltered = new ArrayList<>();
		
		listFiltered = list.stream().filter(x -> x < 20).collect(Collectors.toList());
		
		listFiltered.stream().forEach(System.out::println);
		
		list.stream().map(x -> x*x).forEach(System.out::println);
		
		
		
		
	}

}
