package com.grind.misc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InPlaceReverseArray {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		/*
		int left=0;
		int right = num.length-1;		
		while(left <= right) {
			int temp   = num[left];
			num[left]  = num[right];
			num[right] = temp;
			left++;
			right--;
		}
		*/
		System.out.println(Arrays.toString(num));
		
		IntStream.range(0, num.length/2).forEach(i-> {
			int temp = num[i];
			num[i] = num[num.length-i-1];
			num[num.length-i-1] = temp;
		}
		);
		System.out.println(Arrays.toString(num));
	}
}
