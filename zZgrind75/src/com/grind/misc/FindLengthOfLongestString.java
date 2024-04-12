package com.grind.misc;

import java.util.Arrays;

public class FindLengthOfLongestString {
	
	public static void main(String[] args) {
	
		String[] strings = {"Apple","Banana","Avocado","Orange","Grapes"};
		System.out.println(Arrays.stream(strings).mapToInt(x ->x.length()).max().orElse(0)); 

	}
	
}
