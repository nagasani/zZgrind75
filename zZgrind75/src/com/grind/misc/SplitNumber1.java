package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class SplitNumber1 
{
	public static List<Integer> splitToMinNumbers(int n) 
	{
		List<Integer> result = new ArrayList<>();
		String numberStr = Integer.toString(n);
		int[] digits = new int[numberStr.length()];

		// Convert the number to an array of its digits
		for (int i = 0; i < numberStr.length(); i++) {
			digits[i] = numberStr.charAt(i) - '0';
		}

		boolean hasNonZero = true;

		// Continue until all digits are reduced to 0
		while (hasNonZero) {
			int number = 0;
			hasNonZero = false;

			// Construct a number with 1s and 0s corresponding to the current state of
			// digits
			for (int i = 0; i < digits.length; i++) {
				if (digits[i] > 0) {
					number += Math.pow(10, digits.length - i - 1);
					digits[i]--;
					hasNonZero = true;
				}
			}

			if (number > 0) {
				result.add(number);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 26;
		List<Integer> splitNumbers = splitToMinNumbers(n);
		System.out.println("The number " + n + " can be split into:");
		for (Integer num : splitNumbers) {
			System.out.println(num);
		}
	}
}
