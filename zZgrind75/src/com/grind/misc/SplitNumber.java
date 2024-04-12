package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class SplitNumber {

    public static List<Integer> splitToMinNumbers(int number) {
        List<Integer> result = new ArrayList<>();
        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        for (int i = 0; i < length; i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit > 0) {
                int placeValue = (int) Math.pow(10, length - i - 1);
                for (int j = 0; j < digit; j++) {
                    result.add(placeValue);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 26;
        List<Integer> splitNumbers = splitToMinNumbers(n);
        System.out.println("The number " + n + " can be split into: " + splitNumbers);
    }
}
