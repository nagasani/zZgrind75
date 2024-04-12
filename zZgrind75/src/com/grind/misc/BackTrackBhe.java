package com.grind.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BackTrackBhe {

	public static void main(String[] args) {
		
		int[] i = {1,2,3};
		//char[] c = {'B','O','A','T'};
		List<Integer> lst = Arrays.stream(i).boxed().collect(Collectors.toList());
		//System.out.println(lst);
		backTrackSir(lst, new ArrayList<Integer>(), lst.size());
		
	}

	private static void backTrackSir(List<Integer> lst, List<Integer> newOne, int size) {
		if(newOne.size() == size) {
			System.out.println(newOne);
			return;
		}
		
		for(Integer i:lst) 
		{
			if(newOne.contains(i)) {
				continue;
			}
			newOne.add(i);
			backTrackSir(lst, newOne, size);			
			//System.out.println(i);
		}	
		//lst.remove(size-1);
	}
}
