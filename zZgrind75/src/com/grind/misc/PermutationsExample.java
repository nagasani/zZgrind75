package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class PermutationsExample 
{
	public static void main(String[] args) {
		List<String> stockSymbols = new ArrayList<>();
		stockSymbols.add("AAPL");
		stockSymbols.add("GOOGL");
		stockSymbols.add("MSFT");

		List<List<String>> permutations = generatePermutations(stockSymbols);

		// Print out all permutations
		for (List<String> permutation : permutations) {
			System.out.println(permutation);
		}
	}

	public static List<List<String>> generatePermutations(List<String> symbols) {
		List<List<String>> permutations = new ArrayList<>();

		// Base case: If the list is empty, return an empty permutation
		if (symbols.isEmpty()) {
			permutations.add(new ArrayList<>());
			return permutations;
		}

		// Recursive case: Generate permutations for each symbol in the list
		for (int i = 0; i < symbols.size(); i++) {
			String currentSymbol = symbols.get(i);

			// Create a new list without the current symbol
			List<String> remainingSymbols = new ArrayList<>(symbols);
			remainingSymbols.remove(i);

			// Generate permutations for the remaining symbols
			List<List<String>> remainingPermutations = generatePermutations(remainingSymbols);

			// Prepend the current symbol to each permutation of the remaining symbols
			for (List<String> permutation : remainingPermutations) {
				permutation.add(0, currentSymbol);
				permutations.add(permutation);
			}
		}

		return permutations;
	}
}
