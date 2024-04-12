package com.grind.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Revise
class Solution17 {
   private static final Map<Character, String> phoneDigitsToLetters = new HashMap<>();

    static {
        phoneDigitsToLetters.put('2', "abc");
        phoneDigitsToLetters.put('3', "def");
        phoneDigitsToLetters.put('4', "ghi");
        phoneDigitsToLetters.put('5', "jkl");
        phoneDigitsToLetters.put('6', "mno");
        phoneDigitsToLetters.put('7', "pqrs");
        phoneDigitsToLetters.put('8', "tuv");
        phoneDigitsToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder currentCombination, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneDigitsToLetters.get(digit);

        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(combinations, currentCombination, digits, index + 1);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

}