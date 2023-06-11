package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main1 {

	public static void main2(String[] args) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < 50; i++) {
			int j = (new Random()).nextInt();
			System.out.print(j);
			System.out.print(" ");
			set.add(j);
		}
		System.out.println(" ");
		for(int i: set) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		List<Map> lists = new ArrayList<>();

		lists.stream().map(map1 -> {
			try {
				return update(map1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return map1;
		}).collect(Collectors.toList()).forEach(System.out::println);

		List<String> lst = new ArrayList<>();
		Collections.synchronizedList(lst);
	
	}
	
	static Map update(Map map) throws Exception
	{
		throw new Exception();
		
	}
	
	public static void main(String[] args) {
		List<String[]> lst = new ArrayList<String[]>();
		lst.add(new String[] {"A","B","F"});
		lst.add(new String[] {"D","A","M"});
		lst.add(new String[] {"E","B","L"});
		lst.add(new String[] {"C","G","Y"});		
		Collections.sort(lst, (str1, str2)-> str1[0].compareTo(str2[0]));
		
		lst.forEach(array -> {
	            for (String element : array) {
	                System.out.print(element+" ");
	            }
	            System.out.println("---------------------");
	        });
	}
}
