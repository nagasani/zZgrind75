package com.grind.nomura;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Create a new ArrayList
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        // Print the list
        System.out.println("List after adding elements: " + numbers);

        // Remove the first occurrence of 2
        numbers.remove(Integer.valueOf(2));
        System.out.println("List after removing first occurrence of 2: " + numbers);

        // Remove all occurrences of 2
        numbers.removeAll(Collections.singletonList(2));
        System.out.println("List after removing all occurrences of 2: " + numbers);
    }
}
