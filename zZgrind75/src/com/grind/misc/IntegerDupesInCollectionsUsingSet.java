package com.grind.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerDupesInCollectionsUsingSet {

	public static void main(String[] args) {
		Set<List<Integer>> set = new HashSet<>();
		for(int i=0; i < 10 ; i++) 
		{
			List<Integer> lst1 = new ArrayList<Integer>();			
			for(int j=0; j < 10; j++) 
			{
				Integer j1 = j;
				lst1.add(j1);
			}
			set.add(lst1);
		}
		for(List<Integer> l : set) {
			System.out.println(l);
		}
		List<List<Integer>> list = new ArrayList<>(set);
		for(List<Integer> l : list) {
			System.out.println(l);
		}
	}
}
