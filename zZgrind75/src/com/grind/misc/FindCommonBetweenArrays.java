package com.grind.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonBetweenArrays {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		
		//Arrays.stream(array1).reduce(x->())
		
	List<Integer> lst =	Arrays.stream(array1)
		.filter(x->Arrays.stream(array2).anyMatch(y->y==x))
		.boxed()
		.collect(Collectors.toList());
		System.out.println(lst);
	}
}
