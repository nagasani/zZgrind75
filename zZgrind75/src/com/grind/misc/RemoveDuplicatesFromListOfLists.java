package com.grind.misc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromListOfLists 
{
    public static void main(String[] args) {
        // Example List<List<Integer>> with duplicates
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(List.of(1, 2, 3, 2, 4, 5));
        listOfLists.add(List.of(2, 3, 4, 5, 4, 6));
        listOfLists.add(List.of(7, 8, 9));

        // Remove duplicates
        List<List<Integer>> result = removeDuplicatesFromListOfLists(listOfLists);

        // Output the result
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> removeDuplicatesFromListOfLists(List<List<Integer>> listOfLists) {
        // Flatten the list of lists into a single list
        List<Integer> flattenedList = new ArrayList<>();
        for (List<Integer> list : listOfLists) {
            flattenedList.addAll(list);
        }

        // Create a set to store unique integers
        Set<Integer> uniqueIntegers = new HashSet<>(flattenedList);

        // Create a new list to store non-duplicate lists
        List<List<Integer>> result = new ArrayList<>();

        // Create new lists containing only unique integers
        for (List<Integer> list : listOfLists) {
            List<Integer> uniqueList = new ArrayList<>();
            for (Integer num : list) {
                if (uniqueIntegers.contains(num)) {
                    uniqueList.add(num);
                    uniqueIntegers.remove(num); // Remove the number to avoid duplicates in the future
                }
            }
            result.add(uniqueList);
        }

        return result;
    }
}
