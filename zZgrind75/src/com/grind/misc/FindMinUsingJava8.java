package com.grind.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinUsingJava8 {
	
	public static void main(String[] args) {
		
		int[] numbers = {5,2,8,3,1};
		//int[] numbers = {5};
		//Arrays.sort(numbers);
		//System.out.println(numbers[1]);
		//System.out.println(Arrays.stream(numbers).sorted().skip(1).findFirst().getAsInt());
		System.out.println(
				Arrays.stream(numbers)
				.sorted()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array Doesn't have second Smallest"))
				);
		
		System.out.println(
				Arrays.stream(numbers)
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array Doesn't have second Smallest"))
				);
		
	}

}
